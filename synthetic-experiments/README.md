Create pseudo-data for cell sizes and centroid positions, use these data to test hypotheses.

"size-dependent spatial connectivity". Three features:

* fate-dependent?

* sublineage-dependent?

* lineage tree depth-dependent?


Cluster or community is a group of cells of same size in a restricted spatial location.  

* partition a 3-D volume ([multicell systems](https://github.com/Orthogonal-Research-Lab/origins-embryo/tree/master/Multicell%20Systems)), generate centroids.

* cell size is based on symmetrical nature of partitions (k-D tree algorithm).


Oriented cell diivsions not required for __Drosophila__ wing shape. __Current Biology__, 29 1-9 (2019).

* orientation of cell divisions, "axial" network structure.

* elongated cells embedded in a large number of small sister cells -- parallel sets of weak connections between communities.

[[image of cells and connections]]


Pairwise separability:

1) 3-D positions --> PCA --> PC1 vs. PC2 bivariate plot --> find Euclidean distance --> plot pairwise connectivity --> evaluated at a given threshold tau.

2) use a spherical version of 1). 
