globals
[
  newcomer              ;; an agent who has never collaborated
  component-size        ;; current running size of component being explored
  giant-component-size  ;; size of largest connected component
  components            ;; list of connected components
]

turtles-own
[
  incumbent?   ;; true if an agent has collaborated before
  in-team?     ;; true if an agent belongs to the new team being constructed
  downtime     ;; the number of time steps passed since the agent last collaborated
  explored?    ;; used to compute connected components in the graph
]

links-own
[
  new-collaboration?  ;; true if the link represents the first time two agents collaborated
]


;;;;;;;;;;;;;;;;;;;;;;;;
;;; Setup Procedures ;;;
;;;;;;;;;;;;;;;;;;;;;;;;

to make-newcomer
  create-turtles 1
  [
    set color blue + 1
    set size 1.8
    set incumbent? false
    set in-team? false
    set newcomer self
    set downtime 0
    set explored? false
  ]
end


to setup
  clear-all
  set-default-shape turtles "circle"

  ;; assemble the first team
  repeat team-size [ make-newcomer ]
  ask turtles
  [
    set in-team? true
    set incumbent? true
  ]
  tie-collaborators
  color-collaborations

  ask turtles  ;; arrange turtles in a regular polygon
  [
    set heading (360 / team-size) * who
    fd 1.75
    set in-team? false
  ]
  find-all-components
  reset-ticks
end


;;;;;;;;;;;;;;;;;;;;;;;
;;; Main Procedures ;;;
;;;;;;;;;;;;;;;;;;;;;;;

to go
  ;; all existing turtles are now considered incumbents
  ask turtles [set incumbent? true set color gray - 1.5 set size 0.9]
  ask links [set new-collaboration? false]

  ;; assemble a new team
  pick-team-members
  tie-collaborators
  color-collaborations

  ;; age turtles
  ask turtles
  [
    ;; agents drop out of the collaboration network when they become inactive for max-downtime steps
    if downtime > max-downtime
      [die]

    set in-team? false
    set downtime downtime + 1
  ]

  if layout? [ layout ]
  find-all-components
  tick
end


;; choose turtles to be in a new team
to pick-team-members
  let new-team-member nobody
  repeat team-size
  [
    ifelse random-float 100.0 >= p  ;;with a probability P, make a newcomer
    [
      make-newcomer
      set new-team-member newcomer
    ]
    [
      ;; with a probability Q, choose a new team member who was a previous collaborator of an existing team member
      ;; if the current team has at least one previous collaborator.
      ;; otherwise collaborate with a previous incumbent
      ifelse random-float 100.0 < q and any? (turtles with [in-team? and (any? link-neighbors with [not in-team?])])
        [set new-team-member one-of turtles with [not in-team? and (any? link-neighbors with [in-team?])]]
        [set new-team-member one-of turtles with [not in-team?]]
    ]
    ask new-team-member  ;; specify turtle to become a new team member
    [
      set in-team? true
      set downtime 0
      set size 1.8
      set color ifelse-value incumbent? [yellow + 2] [blue + 1]
    ]
  ]
end


;; forms a link between all unconnected turtles with in-team? = true
to tie-collaborators
  ask turtles with [in-team?]
  [
    create-links-with other turtles with [in-team?]
    [
      set new-collaboration? true  ;; specifies newly-formed collaboration between two members
      set thickness 0.3
    ]
  ]
end


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Visualization Procedures ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; color links according to past experience
to color-collaborations
    ask links with [[in-team?] of end1 and [in-team?] of end2]
    [
      ifelse new-collaboration?
      [
        ifelse ([incumbent?] of end1) and ([incumbent?] of end2)
        [
          set color yellow       ;; both members are incumbents
        ]
        [
          ifelse ([incumbent?] of end1) or ([incumbent?] of end2)
            [ set color turquoise ]  ;; one member is an incumbent
            [ set color blue ]   ;; both members are newcomers
        ]
      ]
      [
        set color red            ;; members are previous collaborators
      ]
    ]
end

;; perform spring layout on all turtles and links
to layout
  repeat 12 [
    layout-spring turtles links 0.18 0.01 1.2
    display
  ]
end


;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Network Exploration ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; to find all the connected components in the network, their sizes and starting turtles
to find-all-components
  set components []
  set giant-component-size 0

  ask turtles [ set explored? false ]
  ;; keep exploring till all turtles get explored
  loop
  [
    ;; pick a turtle that has not yet been explored
    let start one-of turtles with [ not explored? ]
    if start = nobody [ stop ]
    ;; reset the number of turtles found to 0
    ;; this variable is updated each time we explore an
    ;; unexplored turtle.
    set component-size 0
    ask start [ explore ]
    ;; the explore procedure updates the component-size variable.
    ;; so check, have we found a new giant component?
    if component-size > giant-component-size
    [
      set giant-component-size component-size
    ]
    set components lput component-size components
  ]
end

;; finds all turtles reachable from this turtle
to explore ;; turtle procedure
  if explored? [ stop ]
  set explored? true
  set component-size component-size + 1
  ask link-neighbors [ explore ]
end


; Copyright 2007 Uri Wilensky.
; See Info tab for full copyright and license.
