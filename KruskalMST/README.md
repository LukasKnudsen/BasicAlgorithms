# Kruskal's Minimum Spanning Tree (MST)

This project contains a basic implementation in Java of **Kruskal's algorithm** for finding a **Minimum Spanning Tree (MST)** in an edge-weighted undirected graph.

## What it does
Kruskal’s algorithm builds a minimum spanning tree by:
- Sorting all edges by weight
- Repeatedly adding the smallest edge that does not create a cycle
- Continuing until the MST contains V - 1 edges

## Implementation details
- Uses sorting to process edges in increasing order
- Uses a Union-Find data structure to detect cycles efficiently
- Maintains:
  - `mst` → list of edges in the minimum spanning tree
  - `weight` → total weight of the MST

## Complexity
- Time complexity: **O(E log E)**
- Space complexity: **O(E + V)**

## Files
- `Edge.java` – represents weighted edges
- `EdgeWeightedGraph.java` – graph structure
- `UnionFind.java` – cycle detection structure
- `KruskalMST.java` – Kruskal’s algorithm implementation
- `Main.java` – example usage