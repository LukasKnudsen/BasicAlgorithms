# Binary Search Tree (Ordered Map)

This folder demonstrates an **Ordered Map / Ordered Symbol Table**
implemented using a **Binary Search Tree (BST)**.

## What it shows
- Insert / update
- Lookup
- Delete
- Successor query (ceiling key)
- Range count

## Complexity
Average case (reasonably balanced input):
- put/get/remove/ceiling: O(log n)
Worst case (degenerates to a chain):
- put/get/remove/ceiling: O(n)

Range count:
- O(n) in worst case (tree traversal)

## Files
- `BSTMap.java` – BST-based ordered map implementation
- `Main.java` – command-driven demo