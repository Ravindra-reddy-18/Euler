# ProblemThree - Largest Prime Factor

## Overview

This Java program determines the **largest prime factor** of a given number. It is inspired by **Project Euler Problem 3**, which asks for the largest prime factor of `600851475143`.

---

## Features

- Efficient **prime checking** using square root optimization.
- Finds the **largest factor** of a number and checks if it is prime.
- Handles edge cases where the number itself is prime.

---

## How It Works

### 1. `isPrime(long a)`
Checks if a number is prime by testing divisibility up to √a.

### 2. `factors(long x)`
- Starts from √x and works downward.
- For each factor, checks if it is a prime.
- Returns the **largest prime factor** found.

### 3. `main(String[] args)`
- Sets the input number `x = 600851475143`.
- Calls `factors(x)` and prints the result.

---
## To customize change the method call of factors in main.
