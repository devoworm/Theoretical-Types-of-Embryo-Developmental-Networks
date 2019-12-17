# Theoretical Types of Embryo/Developmental Networks  

## Work from the DevoWorm group:

### Papers   
Alicea, B. and Gordon R. (2018). [Cell Differentiation Processes as Spatial Networks: identifying four-dimensional structure in embryogenesis](https://peerj.com/preprints/26587/). _BioSystems_, 173, 235-246.

Alicea, B. (2017). [The Emergent Connectome in _Caenorhabditis elegans_ Embryogenesis](https://doi.org/10.1101/146035). _BioSystems_, 173, 247-255.

### Open Datasets   
Alicea, B., Gordon, R., and Banerjee, A. (2018). [Embryo networks and connectomes in _Caenorhabditis elegans_](https://osf.io/q9jvb/). doi:10.17605/OSF.IO/Q9JVB. 

[Connectome Datasets](https://github.com/Orthogonal-Research-Lab/GSoC-Braitenberg-Vehicles/tree/master/Connectome%20Datasets), Orthogonal Research and Education Laboratory.

### Synthetic and Pseudo-data
Network Emergent Connectivity using TSP and Euler Paths  [Github repo](https://github.com/devoworm/Theoretical-Types-of-Embryo-Developmental-Networks/tree/master/Network-Connectivity-TSP-Experiments),   [talk](https://docs.google.com/presentation/d/1k0Bkqlbrxo9rZTCa21YMs4BEDWNzSSUpi4GjHDuoUnk/edit#slide=id.p)

## Basic Network Concepts and Similar Work (see also bibiography):  
1. [Network Primer from NetSciEd](https://sites.google.com/a/binghamton.edu/netscied/teaching-learning/network-concepts)  

2. [Anatomical Networks Approach](https://anatomicalnetworks.com/)  

3. [Embryogenetic Connectome data from DevoWorm](https://github.com/devoworm/embryogenetic-connectome)  

4. [Matthew D.B. Jackson](https://www.researchgate.net/profile/Matthew_Jackson22) and the [Bassell Lab](http://www.georgebassellab.com/datasets/), University of Birmingham (UK)

## Conventional Types of Complex Network:  
1. [Random Network](https://en.wikipedia.org/wiki/Random_graph)  

2. [Scale-free Network](https://en.wikipedia.org/wiki/Scale-free_network)  

3. [Small-world Network](https://en.wikipedia.org/wiki/Small-world_network)  

These types are based on degree distribution and the global patterns of connectivity. These types do not account for connectivity based on geometric or spatial constraints.  

## Types of Spatial Networks:  
1. [Hyperbolic Geometric Graph](https://en.wikipedia.org/wiki/Hyperbolic_geometric_graph)  

2. [Random Geometric Graph](https://en.wikipedia.org/wiki/Random_geometric_graph)  

3. [Planar Graph](https://en.wikipedia.org/wiki/Planar_graph)  

These types do account for connectivity based on geometric or spatial constraints, and provide a means to model phenomena that are dependent on spatial structure.    

## Types of Node and Edge Construction:  
1. [Barabási–Albert model (preferential attachment)](https://en.wikipedia.org/wiki/Barab%C3%A1si%E2%80%93Albert_model)  

2. [Erdos–Renyi model (equiprobable edges)](https://en.wikipedia.org/wiki/Erd%C5%91s%E2%80%93R%C3%A9nyi_model)  

3. [Fitness model](https://en.wikipedia.org/wiki/Fitness_model_(network_theory))  

These models account for the probability of all connections between nodes. In the equiprobable case, any one node can be connected to any other node with equal probability. In other models, there is bias for certain nodes given active processes (selection, decision-making bias).  

## Types of Topological Minimization:  
1. [Steiner Tree](https://en.wikipedia.org/wiki/Steiner_tree_problem)/[Voronoi Trees](https://en.wikipedia.org/wiki/Voronoi_diagram)

2. [Dependency Network](https://en.wikipedia.org/wiki/Dependency_network)  

3. [Interdependent Network](https://en.wikipedia.org/wiki/Interdependent_networks)  

These types are defined by their ability to capture and reproduce geometric features and spatial dependencies. However, these are no clear relationships between spatial connectivity and scaling laws, particularly as they relate to biological processes.  

## _In vivo_:   
We find a number of global patterns in embryo networks that do not conform with a typical mathematical model of connectivity. Some of these features have to do with differentiation, while others have to do with polarity and the geometry of the emerging phenotpye:  

1) spatial segregation by sublineage a few rounds of division after the founder cells appear for major sublineages. 

2) spatial diversification of sublineages over time.

3) spatial re-segregation of cells as tissues begin to form.

In embryo networks, so-called nodes are cells that are both small and have many immediate neighbors.  

See examples from various species in repository, and check out work on [Zebrafish embryo for Zygote and Cleavage stages](https://github.com/devoworm/zebrafish-embryo).  

## Criticality in the Embryo and Developing Nervous System:  

### Avalanche model:  
Vollmer, J., Casares, F., and Iber, D. (2017). [Growth and size control during development](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5717347/). _Open Biology_, 7, 170190.  

Dhar, D., and Sadhu, T. (2013). [A sandpile model for proportionate growth](https://iopscience.iop.org/article/10.1088/1742-5468/2013/11/P11006). _Journal of Statistical Mechanics: Theory and Experiment_, P11006.  

### Jamming transition:  
Mongera, A., Serwane, F., Rowghanian, P., Gustafson, H.J., Shelton, E., Kealhofer, D.A., Carn, E.K., Serwane, F., Lucio, A.A., Giammona, J., and Campas, O. (2018). [A fluid-to-solid jamming transition underlies vertebrate body axis elongation](https://www.nature.com/articles/s41586-018-0479-2). _Nature_, 561, 401-405.  

Sadati, M., Qazvini, N.T., Krishnan, R., Park, C.Y., Fredberg, J.J. (2013). [Collective migration and cell jamming](https://www.sciencedirect.com/science/article/pii/S0301468113000170). _Differentiation_, 86(3), 121-125.  

### Propagation Criticality
Cota, W., Odor, G., and Ferreira, S.C. (2018). [Griffiths phases in infinite-dimensional, non-hierarchical modular 
networks](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC6002411/). _Scientific Reports_, 8, 9144. doi:10.1038/s41598-018-27506-x.

## Wiring Minimization (Efficiency of Wiring):

Chklovskii, D.B., Schikorski, T., Stevens, C.F. (2002). [Wiring Optimization in Cortical Circuits](https://www.sciencedirect.com/science/article/pii/S0896627302006797). _Neuron_, 34, 341–347.  

Raj, A., Chen, Y-H. (2011). [The Wiring Economy Principle: Connectivity Determines Anatomy in the Human Brain](https://journals.plos.org/plosone/article?id=10.1371/journal.pone.0014832). _PLoS One_, 6(9), e14832.  

Sporns, O. (2011). [The non-random brain: effciency, economy, and complex dynamics](https://www.frontiersin.org/articles/10.3389/fncom.2011.00005/full). _Frontiers in Computational Neuroscience_, doi:10.3389/fncom.2011.00005.  

Avena-Koenigsberger, A., Yan, X., Kolchinsky, A., van den Heuvel, M.P., Hagmann, P., Sporns, O. (2019). [A spectrum of routing strategies for brain networks](https://journals.plos.org/ploscompbiol/article/file?id=10.1371/journal.pcbi.1006833&type=printable). _PLoS Computational Biology_, 15(3), e1006833.  

Kaiser, M. and Hilgetag, C.C. (2006). [Nonoptimal Component Placement, but Short Processing Paths, due to Long-Distance
Projections in Neural Systems](https://journals.plos.org/ploscompbiol/article?id=10.1371/journal.pcbi.0020095). _PLoS Computational Biology_, 2(7), e95. 

## Network Structure:  
Azulay, A., Itskovits, E., and Zaslaver, A. (2016). [The _C. elegans_ Connectome Consists of Homogenous Circuits with Defined Functional Roles](https://journals.plos.org/ploscompbiol/article?id=10.1371/journal.pcbi.1005021). _PLoS Computational Biology_, 12(9), e1005021.  

Bassett, D.S. and Bullmore, E.T. (2017). [Small-World Brain Networks Revisited](https://journals.sagepub.com/doi/full/10.1177/1073858416667720). _The Neuroscientist_, 23(5), 499–516.  

Hilgetag, C.C. and Goulas, A. (2016). [Is the brain really a small-world network](https://link.springer.com/article/10.1007/s00429-015-1035-6)? _Brain Structure and Function_, 221, 2361–2366. doi:10.1007/s00429-015-1035-6

Holme, P. (2019). [Rare and everywhere: Perspectives on scale-free networks](https://doi.org/10.1038/s41467-019-09038-8). _Nature Communications_, doi:10.1038/s41467-019-09038-8.  

Majhi, S., Bera, B.K., Ghosh, D., Perc, M. (2018). [Chimera states in neuronal networks: A review](https://www.sciencedirect.com/science/article/pii/S1571064518301088). _Physics of Life Reviews_, doi:10.1016/j.plrev.2018.09.003.  

Muldoon, S.F., Bridgeford, E.W., & Bassett, D.S. (2016). [Small-World Propensity and Weighted Brain Networks](https://www.nature.com/articles/srep22057). Scientific Reports, 6, 22057.  

Papo, D., Zanin, M., Martinez, J.H., and Buldu, J.M. (2016). [Beware of the Small-World Neuroscientist](https://doi.org/10.3389/fnhum.2016.00096)! _Frontiers in Human Neuroscience_,
doi:10.3389/fnhum.2016.00096.   

Wig, G.S. (2017). [Segregated Systems of Human Brain Networks](https://www.sciencedirect.com/science/article/pii/S1364661317301948). _Trends in Cognitive Science_, 21(12), 981-996. doi:10.1016/j.tics.2017.09.006   

Watts, D.J. and Strogatz, S.H. (1998). [Collective dynamics of small-world networks](https://www.nature.com/articles/30918). _Nature_, 393, 440-442.   

## Standards:  
INCF SIG: [Standard Representations of Network Structures](https://www.incf.org/activities/standards-and-best-practices/incf-special-interest-groups/incf-sig-on-standardised).


## Bibliography:  
Alicea, B. and Gordon R. (2018). [Cell Differentiation Processes as Spatial Networks: identifying four-dimensional structure in embryogenesis](https://www.sciencedirect.com/science/article/pii/S030326471830220X?via%3Dihub). _BioSystems_, 173, 235-246. [doi:10.1016/j.biosystems.2018.09.009](https://www.sciencedirect.com/science/article/pii/S030326471830220X?via%3Dihub).  

Esteve-Altava B, Marugán-Lobón J, Botella H, and Rasskin-Gutman D. (2011). [Network models in anatomical systems](https://www.researchgate.net/publication/51632144_Network_Models_in_Anatomical_Systems). Journal of Anthropological Sciences, 89, 175-184. [doi:10.4436/jass.89016](https://www.researchgate.net/publication/51632144_Network_Models_in_Anatomical_Systems).  

Esteve-Altava, B., Marugán-Lobon, J., Botella, H. (2013). [Structural Constraints in the Evolution of the Tetrapod Skull Complexity: Williston’s Law Revisited Using Network Models](https://doi.org/10.1007/s11692-012-9200-9). Evolutionary Biology, 40, 209. [doi:10.1007/s11692-012-9200-9](https://doi.org/10.1007/s11692-012-9200-9).  

Jackson, M.D.B., Duran-Nebreda, S., and Bassel, G.W. (2017). [Network-based approaches to quantify multicellular development](https://royalsocietypublishing.org/doi/full/10.1098/rsif.2017.0484). _Journal of the Royal Society Interface_, 14(135), 20170484. [doi:10.1098/rsif.2017.0484](https://royalsocietypublishing.org/doi/full/10.1098/rsif.2017.0484).  

Jackson, M.D.B., Xu, H., Duran-Nebreda, S., Stamm, P., Bassel, G.W. (2017). [Topological analysis of multicellular complexity in the plant hypocotyl](https://elifesciences.org/articles/26023). _eLife_, 6, e26023. [doi:10.7554/eLife.26023](https://elifesciences.org/articles/26023).  
