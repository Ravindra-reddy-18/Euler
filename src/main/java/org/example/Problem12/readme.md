# Problem 12 – Highly Divisible Triangular Number

This program solves **Project Euler Problem 12**, which asks for the first triangular number with **over 500 divisors**.

## 🔍 Problem Summary

A triangular number is the sum of the natural numbers up to a certain number `n`:

We want the **first triangular number** that has **more than 500 divisors**.

---

## 🚀 Optimization Strategy

Instead of factoring the full triangular number \( T_n = \frac{n(n+1)}{2} \), we use the following **efficient trick**:

- Since `n` and `n+1` are **coprime**, we can factor them **separately**.
- We divide one of them by 2 depending on whether `n` is even or odd:
  - If `n` is even: `count(n/2) * count(n+1)`
  - If `n` is odd:  `count(n) * count((n+1)/2)`

This works because the number of divisors of two **coprime numbers multiplied** is the **product of their individual divisor counts**.

---

## 🧠 Code Overview

### `count(long n)`
Returns the total number of positive divisors of `n` using an efficient loop up to √n.

### `main(String[] args)`
- Loops through integers `i`, checking each triangular number.
- For each `i`, it calculates the number of divisors of the triangular number using the optimized strategy.
- Stops when a triangular number with over **500 divisors** is found.
- Prints the time taken and the first such triangular number.

---

## ⏱ Performance

The optimized divisor-counting method significantly reduces computation time compared to directly factoring each large triangular number.

---

A new thing i learned is when two numbers are coprime, the number of divisors of their product is the product of their number of divisors.



