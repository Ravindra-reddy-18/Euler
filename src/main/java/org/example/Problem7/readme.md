# Package7

## Overview
This program finds the **10,001st prime number** using a simple prime-checking method.

It iteratively checks numbers for primality and counts how many primes have been found until reaching the 10,001st prime.

---

## How It Works
- **Prime Checking**:
    - A number `n` is prime if no integer between `2` and `√n` divides it.
- **Process**:
    - Start from `2` and check each number.
    - If a number is prime, increment the count.
    - Stop when the count reaches `10,001`.
    - Print the 10,001st prime.

---
- looking at the problem for the first time, i thought the loop would have to run forever. but i'm surprised how quick it was. think it was less than a second!!
