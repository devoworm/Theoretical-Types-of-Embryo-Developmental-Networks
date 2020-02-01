## New World Networks: development as phenotypic velocity

### Introduction

New World Networks are networks that expand as a result of a growth/reduction or differentiation/conversion process.

* new world networks are embryogenetic networks or developmental connectomes that expand according to a connectivity rule (e.g. preferential attachment).

* expansion affects size, connectivity, and spatial extent of the network. The spatial extent is more about shape than size.  

* new world models are generally expected to be scale-free [1], but have a number of additional properties that are relevant to the application domain.

#### Propose a few connection rules: 

1) birth time.

2) developmental lineage proximity.

3) fellow sisters (sister cells born of the same mother cell).

4) common fate.

5) bilateral pairs (differentiation).

Some of these (2-5) are demonstrated for _C. elegans_ in [Developmental trajectory of _Caenorhabditis elegans_ nervous system governs its structural organization](https://journals.plos.org/ploscompbiol/article?id=10.1371/journal.pcbi.1007602) 

These cells connect according to a connection rule, which then influences later identity and activity in ways that either introduce asymmetry or reinforce symmetry. The can be modeled using a first-mover game as shown in [Raising the Connectome: the emergence of neuronal activity and behavior in _C. elegans_](https://www.biorxiv.org/content/10.1101/2020.01.06.896308v1).

New World Networks can also utilize multiple connection rules simultaneously, in a way that allows for equilibrium shifts in the first-mover game theory model.  

#### Co-evolving networks: developmental connectome and embryogenetic network:

As the developmental connectome increases in size (number of cells) and diameter (shortest path across network), the embryogenetic network in the same organism shifts its connectivity or decreases in size (disconnection of differentiated cells, reconnection to newer developmental cells).

* we can work from the data in "[Data-theoretical Synthesis of the Early Developmental Process](https://www.biorxiv.org/content/10.1101/282004v2)" to get a handle on the dynamics in _C. elegans_ development.

#### Key points:

* number of nodes grows or shrinks at each time point. Subsequent effects on the number and distribution of edges in the network.

* this has an effect on changes in connectivity at the subsequent time point. Also has an effect on routing strategies on network over time.

* large-world networks, which are discussed in the paper [Is the brain really a small-world network?](https://link.springer.com/article/10.1007/s00429-015-1035-6): network expands faster than shortcuts can form. As a result, [small-world networks](http://www.scholarpedia.org/article/Small-world_network) can become disconnected.

* suggests biologically-based and mathematically-rigorous alternatives to [preferential attachment](https://en.wikipedia.org/wiki/Preferential_attachment), which tends to reinforce hierarchies.

#### References:
[1] Albert, R. (2005). Scale-free networks in cell biology. Journal of Cell Science, 118(21), 4947-4957.  
