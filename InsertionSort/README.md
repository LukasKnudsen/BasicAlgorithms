# Insertion Sort 

This folder demonstrates **Insertion Sort**

## Algorithm idea
Insertion Sort builds a sorted prefix of the array:
1. Take the next element (key)
2. Shift larger elements one position to right
3. Insert the key into its position

## Complexity
- Best case (sorted from start): **O(n)**
- Average case: **O(n²)**
- Worst case (sorted in wrong order): **O(n²)**
- Extra space: **O(1)** (in-place)

## Files
- `InsertionSort.java` – the sorting algorithm
- `Record.java` – comparable data type used for the demo
- `Main.java` – entry point (reads input, sorts, prints output)