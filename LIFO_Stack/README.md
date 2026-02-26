# Stack (LIFO)

This folder demonstrates the **Stack** data structure (Last-In-First-Out).

## What is a Stack?
A stack supports:
- `push(x)` insert element on top
- `pop()` remove and return top element
- `peek()` return top element without removing
- `isEmpty()` check if empty

LIFO means the **last inserted element is the first removed**.

## Implementation
This stack is implemented manually using:
- a `char[]` array
- an integer `top` pointer

## Complexity
- push: O(1)
- pop: O(1)
- peek: O(1)

## Files
- `CharStack.java` – array-based stack implementation
- `StackExample.java` – example algorithm using the stack
- `Main.java` – entry point