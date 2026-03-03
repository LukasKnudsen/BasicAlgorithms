# Greedy Apportionment (Highest Averages)

This folder demonstrates a **greedy apportionment algorithm** using the **highest averages** rule.

## Problem 
Given:
- `n` groups with integer weights (e.g., votes)
- `k` identical units to distribute (e.g., seats)

Allocate the `k` units by repeatedly assigning the next unit to the group with the largest quotient:

`weight[i] / (allocation[i] + 1)`

## Why?
This is a greedy algorithm: at each step it makes the locally best choice (highest current quotient) and sticks to it.

Used in proportional allocation settings.

## Complexity
Let `n` be the number of groups and `k` the number of units

The implementation scans all `n` groups for each of the `k` allocations:
- Time: **O(n · k)**
- Space: **O(n)**

## Files
- `HighestAverages.java` – the algorithm
- `Main.java` – reads input, runs allocation, prints result