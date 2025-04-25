# ProblemFive - Smallest Multiple

## Overview

This Java program solves a classic number theory problem:  
**Find the smallest positive number that is evenly divisible by a given range of numbers.**

Specifically, it solves for numbers **1 through 20**, a variant of **Project Euler Problem 5**.

---

## Features

- Two approaches discussed:
  - 🧠 **Optimized Math Shortcut** (commented)
  - 🐌 **Brute-force check** starting from 2520

---

## How It Works

### 1. Brute Force Loop
- Starts from 2520 (LCM of 1–10).
- Increments by 1.
- Checks divisibility by a **selected subset of critical numbers** from 1–20:
  - `5, 7, 9, 11, 13, 16, 17, 19`
- Stops at the first number divisible by all of them.

> Note: These values are selected because if a number is divisible by these, it’s also divisible by the others in the range.

### 2. Commented Shortcut
- Hardcoded product of LCM components.
- Shows the logic for an O(1) solution if primes and powers are known.
- LCM(1..20) = 2⁴ × 3² × 5 × 7 × 11 × 13 × 17 × 19


---
I tried the brute force method first, but know there has to be some better way of doing it, almost got there, however, one of the problem's forum messages made me realize i was on the right path, and how simple it is. There are some really cool approaches in those forums, especially, one on the palindrome product. I didn't even know we can solve that one with just a pen and a paper. 😂
