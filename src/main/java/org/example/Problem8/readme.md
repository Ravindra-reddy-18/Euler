# Problem 8 - Largest Product in a Series

## Overview

This program solves **Project Euler Problem 8**:

> Find the greatest product of thirteen consecutive digits in a 1000-digit number.

---

## How It Works

- The large 1000-digit number is stored as a `String`.
- The program **slides a window of 13 digits** across the number.
- For each window:
    - It calculates the **product** of the 13 digits.
    - It keeps track of the **maximum product** found.
- Finally, it prints the maximum product.

---

## Key Points

- **Nested loops** are used:
    - Outer loop: moves the window from start to end.
    - Inner loop: multiplies 13 consecutive digits.
- Digits are converted from characters to integers using `Integer.parseInt`.
- Variables:
    - `a`: current product
    - `max`: maximum product found so far

---
- Tried to make it more efficient to O(n), but the zeros in the input are giving me a hard time for now, I'll try to do some more research and implement in the coming days.