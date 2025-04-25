# ProblemFour - Largest Palindromic Product

## Overview

This Java program finds the **largest palindrome** made from the product of two 3-digit numbers.  
It’s inspired by **Project Euler Problem 4**.

---

## Features

- Checks whether a number is a **palindrome**.
- Iterates through all products of 3-digit numbers.
- Efficiently stops inner loop early once a palindrome is found.

---

## How It Works

### 1. `isPalindrome(int a)`
- Converts the number to a string.
- Reverses the string using `StringBuilder`.
- Compares original and reversed strings.

### 2. Nested Loops
- Outer loop: `i` from 999 to 100.
- Inner loop: `j` from 999 to 100.
- For each product `i * j`, checks if it’s a palindrome.
- If it is and greater than the current max, updates the max.
- Breaks inner loop early for performance once a palindrome is found.

### 3. Output
Prints the **largest palindrome product** of two 3-digit numbers.

---

