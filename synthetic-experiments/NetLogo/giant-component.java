turtles-own
[
  ;; this is used to mark turtles we have already visited
  explored?
]

globals
[
  component-size          ;; number of turtles explored so far in the current component
  giant-component-size    ;; number of turtles in the giant component
  giant-start-node        ;; node from where we started exploring the giant component
]

;;;;;;;;;;;;;;;;;;;;;;;;
;;; Setup Procedures ;;;
;;;;;;;;;;;;;;;;;;;;;;;;

to setup
  clear-all
  set-default-shape turtles "person"
  make-turtles
  ;; at this stage, all the components will be of size 1,
  ;; since there are no edges yet
  find-all-components
  color-giant-component
  reset-ticks
end

to make-turtles
  create-turtles num-nodes [ set size 3 ]
  layout-circle turtles max-pxcor - 1
end

;;;;;;;;;;;;;;;;;;;;;;
;;; Main Procedure ;;;
;;;;;;;;;;;;;;;;;;;;;;

to go
  ;; stop if the below condition is true, as then we have a fully connected network (every two nodes are connected)
  if ( (2 * count links ) >= ( (count turtles) * (count turtles - 1) ) ) [
    display
    user-message "Network is fully connected. No more edges can be added."
    stop
  ]
  add-edge
  find-all-components
  color-giant-component
  ask links [ set color [color] of end1 ]  ;; recolor all edges
  ;; layout the turtles with a spring layout, but stop laying out when all nodes are in the giant component
  if not all? turtles [ color = red ] [ layout ]
  tick
end

;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Network Exploration ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; to find all the connected components in the network, their sizes and starting turtles
to find-all-components
  ask turtles [ set explored? false ]
  ;; keep exploring till all turtles get explored
  loop
  [
    ;; pick a node that has not yet been explored
    let start one-of turtles with [ not explored? ]
    if start = nobody [ stop ]
    ;; reset the number of turtles found to 0
    ;; this variable is updated each time we explore an
    ;; unexplored node.
    set component-size 0
    ;; at this stage, we recolor everything to light gray
    ask start [ explore (gray + 2) ]
    ;; the explore procedure updates the component-size variable.
    ;; so check, have we found a new giant component?
    if component-size > giant-component-size
    [
      set giant-component-size component-size
      set giant-start-node start
    ]
  ]
end

;; Finds all turtles reachable from this node (and recolors them)
to explore [new-color]  ;; node procedure
  if explored? [ stop ]
  set explored? true
  set component-size component-size + 1
  ;; color the node
  set color new-color
  ask link-neighbors [ explore new-color ]
end

;; color the giant component red
to color-giant-component
  ask turtles [ set explored? false ]
  ask giant-start-node [ explore red ]
end

;;;;;;;;;;;;;;;;;;;;;;;
;;; Edge Operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;

;; pick a random missing edge and create it
to add-edge
  let node1 one-of turtles
  let node2 one-of turtles
  ask node1 [
    ifelse link-neighbor? node2 or node1 = node2
    ;; if there's already an edge there, then go back
    ;; and pick new turtles
    [ add-edge ]
    ;; else, go ahead and make it
    [ create-link-with node2 ]
  ]
end

;;;;;;;;;;;;;;
;;; Layout ;;;
;;;;;;;;;;;;;;
to layout
  if not layout? [ stop ]
  ;; the number 10 here is arbitrary; more repetitions slows down the
  ;; model, but too few gives poor layouts
  repeat 10 [
    do-layout
    display  ;; so we get smooth animation
  ]
end

to do-layout
  layout-spring (turtles with [any? link-neighbors]) links 0.4 6 1
end


; Copyright 2005 Uri Wilensky.
; See Info tab for full copyright and license.
