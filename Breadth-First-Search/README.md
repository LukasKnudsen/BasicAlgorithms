# Graph - BFS 

This folder demonstrates how to check whether a graph is bipartite using **Breadth-First Search (BFS)**.

## Concept

A graph is bipartite if its vertices can be colored with two colors such that no edge connects two vertices of the same color.

This implementation:

- Uses BFS traversal
- Assigns colors (0 or 1)
- Verifies consistency across all connected components

## Algorithm

For each unvisited node:
1. Start BFS
2. Assign initial color (0)
3. For each edge:
   - If constraint requires opposite color → assign opposite
   - If constraint requires same color → assign same
4. If a conflict occurs → graph is not bipartite

## Complexity

Let:
- n = number of vertices
- m = number of edges

Time complexity: **O(n + m)**  
Space complexity: **O(n + m)**

## Files

- `Graph.java` – adjacency list + BFS bipartite check
- `Main.java` – input handling and execution