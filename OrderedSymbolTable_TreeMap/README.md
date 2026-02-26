# Ordered Symbol Table (TreeMap / Balanced BST)

This project demonstrates an **Ordered Symbol Table** using Java’s `TreeMap`
(Implemented with a **self-balancing binary search tree**).

## What it does
The program maintains key→value pairs in sorted key order and supports typical
ordered operations:

- Insert / update (`put`)
- Delete (`remove`)
- Lookup (`get`)
- Successor query (`ceilingEntry`) → “next key ≥ x”
- Range count (`subMap(lo, hi).size()`)

## Complexity (TreeMap / balanced BST)
- Insert / delete / lookup: **O(log n)**
- Successor (`ceilingEntry`): **O(log n)**
- Range count via `subMap(...).size()`: typically **O(k)** for iterating elements,
  but in practice used here as a library operation (implementation-dependent).

## Files
- `OrderedSymbolTable.java` – command processor built on top of a `TreeMap`
- `Main.java` – entry point