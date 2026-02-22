# Union-Find (Disjoint Set Union)

A simple Java implementation of the Union-Find / Disjoint Set Union data structure
using path compression and union by size.

This is commonly used for **dynamic connectivity** problems: 
you repeatedly connect two items and want to know which connected component they belong to.

## Problem behavior
Input is a number `N` followed by `N` lines, each containing two building names.
After each connection, the program prints the **size of the connected component** containing those two buildings.

## Complexity
- Amortized time per operation: ~ **O(α(n))** (inverse Ackermann, practically constant)
- Space: **O(n)**

## Files
- `src/UnionFind.java` — DSU implementation with string-to-id mapping
- `src/Main.java` — reads input, performs unions, prints component sizes

## Run
Compile:
```bash
javac src/*.java