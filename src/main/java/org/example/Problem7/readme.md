# Problem7

## Overview
This program finds the **10,001st prime number**, using a **`Predicate` functional interface** to define the prime-checking logic in a clean, functional style.

---

## How It Works
- **Predicate Definition**:
  - A `Predicate<Integer>` called `p` is defined using a lambda function.
  - It checks if a number `n` is prime by trying all divisors up to `√n`.
- **Finding the 10,001st Prime**:
  - Start from `2` and test each number using `p.test(i)`.
  - Increment a counter for each prime found.
  - When the counter reaches `10,001`, print the number.

---

- looking at the problem for the first time, i thought the loop would have to run forever. but i'm surprised how quick it was. think it was less than a second!!
