# Prim's Minimum Spanning Tree (MST)

This project contains a basic implementation in Java of **Prim's algorithm** for finding a **Minimum Spanning Tree (MST)** in an edge-weighted undirected graph.

## What it does
Prim’s algorithm builds a minimum spanning tree by:
- Starting from an arbitrary vertex
- Repeatedly adding the lowest-weight edge that connects a new vertex to the tree
- Continuing until all vertices are included

## Implementation details
- Uses a priority queue for efficient edge selection  
- Maintains arrays for:
  - `distTo` → shortest known edge weight to the tree
  - `edgeTo` → edge connecting each vertex to the MST
  - `marked` → visited vertices

## Complexity
- Time complexity: **O(E log V)**
- Space complexity: **O(V)**

## Files
- `Edge.java` – represents weighted edges  
- `EdgeWeightedGraph.java` – graph structure  
- `PrimMST.java` – Prim’s algorithm implementation  
- `Main.java` – example usage