# Project Euler Problem 9: Special Pythagorean Triplet

This repository contains a Java solution to [Project Euler Problem 9](https://projecteuler.net/problem=9), which asks:

> A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
>
> a² + b² = c²
>
> For example, 3² + 4² = 9 + 16 = 25 = 5².
>
> There exists exactly one Pythagorean triplet for which a + b + c = 1000.
>
> Find the product abc.

---

## 💡 Approach

- The program uses a **nested loop** to find values of `a` and `b` such that `a + b + c = 1000`, where `c = 1000 - a - b`.
- It leverages the constraint `a < b < c` to reduce unnecessary iterations by bounding `b < (1000 - a) / 2`.
- It checks the condition `a² + b² = c²` using simple integer arithmetic (no floating-point errors).

---