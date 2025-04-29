# Project Euler Problem 9 - Special Pythagorean Triplet

This Java program finds the **Pythagorean triplet (a, b, c)** such that:

- a² + b² = c²
- a + b + c = 1000

It then prints the product `abc`.

## 🚀 How It Works

- The `tri` function checks if three integers form a Pythagorean triplet.
- The `main` method brute-forces all combinations where `a + b + c = 1000` and `a < b < c`.
- Once it finds the correct triplet, it prints the product and exits.


