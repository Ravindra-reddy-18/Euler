# ProblemSix

## Overview
This program calculates the difference between:
- The **square of the sum** of the first 100 natural numbers, and
- The **sum of the squares** of the first 100 natural numbers.

It uses a **direct mathematical formula** for an optimized O(1) solution.

---

## How It Works
- Instead of using loops, the program applies two formulas:
  - **Sum of first _n_ numbers**:  
    \[
    \text{Sum} = \frac{n(n+1)}{2}
    \]
  - **Sum of squares of first _n_ numbers**:  
    \[
    \text{Sum of Squares} = \frac{n(n+1)(2n+1)}{6}
    \]
- For `n = 100`, it calculates:
  - Square of the sum → `(50 × 101)^2`
  - Sum of squares → `(100 × 101 × 201) / 6`
- Finally, it subtracts the two results and prints the answer.

---
There's a loop version also in the program too(commented out). Pretty basic, just loops through 1 to 100, calculates sum of 1 to 100 and squares the result. calculates squares of 1 to 100 and adds them, finally subtracting both results.
