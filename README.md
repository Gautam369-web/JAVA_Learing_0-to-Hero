# Chapter 1 – Java Foundations

## 1.1 What is Java?
- A **high‑level**, **object‑oriented** programming language.
- Write once, run anywhere (thanks to the **JVM** – Java Virtual Machine).
- Two main components:
  - **JDK** (Java Development Kit) – compilers, tools, libraries.
  - **JRE** (Java Runtime Environment) – runs compiled `.class` files.

## 1.2 Your First Program – `HelloWorld.java`
```java
public class HelloWorld {
    public static void main(String[] args) {
        // This is your first line of code!
        // System.out represents the standard output stream (the screen)
        // println is a method that prints text and moves to a new line
        System.out.println("Hello, World! I am learning Java.");
    }
}
```
**Explanation**
- `public class HelloWorld` – defines a class named **HelloWorld**. The file name must match the class name (`HelloWorld.java`).
- `public static void main(String[] args)` – the **entry point** of every Java application. The JVM looks for this exact signature to start execution.
- `System.out.println(...)` – prints a line to the console.

## 1.3 How to Compile & Run
Open a terminal inside the `Basics` folder and execute:
```bash
# Compile (creates HelloWorld.class)
javac HelloWorld.java
# Run the program
java HelloWorld
```
You should see:
```
Hello, World! I am learning Java.
```
If you get `javac: command not found`, ensure the JDK is installed and `JAVA_HOME` is added to your `PATH`.

## 1.4 Practice Problems (Chapter 1)
### Problem 1 – Sum of Two Numbers
**Statement**: Read two integers `a` and `b` from standard input and output their sum `a + b`.
**Input**: `a b` (space‑separated)
**Output**: Single integer representing the sum.
### Problem 2 – Even or Odd
**Statement**: Read an integer `n` and print `Even` if it is divisible by 2, otherwise `Odd`.
**Input**: One integer `n`.
**Output**: The word `Even` or `Odd`.
### Problem 3 – Temperature Converter
**Statement**: Convert a temperature from Celsius to Fahrenheit using the formula `F = C * 9/5 + 32`.
**Input**: A floating‑point number `c`.
**Output**: Fahrenheit value with up to two decimal places.

### How to Test
Create a new file for each problem, e.g., `SumTwo.java`, `EvenOdd.java`, `CtoF.java`, implement the `main` method using `Scanner`, compile with `javac` and run with `java`. Compare your output with the expected results.

---
Feel free to ask for the solution template for any of the practice problems, or let me know when you have compiled and run `HelloWorld.java` successfully!

# Chapter 1 – Practice Problem Solutions

## Problem 1 – Sum of Two Numbers
```java
import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        sc.close();
    }
}
```
**Explanation**
- Reads two integers using `Scanner.nextInt()`.
- Prints their sum directly.
- Closes the scanner to free the underlying `System.in` stream.

---

## Problem 2 – Even or Odd
```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
```
**Explanation**
- `%` is the remainder operator. If `n % 2` equals `0`, the number is even.

---

## Problem 3 – Temperature Converter (Celsius → Fahrenheit)
```java
import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = c * 9.0 / 5.0 + 32.0;
        // Print with up to two decimal places
        System.out.printf("%.2f\n", f);
        sc.close();
    }
}
```
**Explanation**
- Uses the formula `F = C * 9/5 + 32`.
- `System.out.printf` formats the output to two decimal places (you can adjust the format as needed).

---

## How to Test Each Solution
1. Create a file with the exact class name (`SumTwo.java`, `EvenOdd.java`, `CtoF.java`).
2. Compile: `javac <FileName>.java`
3. Run: `java <ClassName>` and provide input as described in the problem statements.
4. Verify the output matches the expected result.

Feel free to modify the code, experiment with additional test cases, or ask for deeper explanations on any concept.

# Chapter 2 – Control Flow

## 2.1 Conditional Statements
### `if‑else`
```java
int n = 7;
if (n % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```
- The condition inside `()` must evaluate to a **boolean**.
- Only one `else` block can exist; multiple conditions use `else if`.

### `switch`
```java
char grade = 'B';
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
    case 'C':
        System.out.println("Good");
        break;
    default:
        System.out.println("Needs improvement");
}
```
- Works with `byte`, `short`, `int`, `char`, `String`, and enum types.
- `break` prevents fall‑through.

---
## 2.2 Loops
### `for` loop (classic)
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
- Ideal when the number of iterations is known.

### Enhanced `for` (foreach) – works on arrays and `Iterable` collections
```java
int[] arr = {2, 4, 6};
for (int val : arr) {
    System.out.println(val);
}
```

### `while` loop
```java
int i = 0;
while (i < 3) {
    System.out.println(i);
    i++;
}
```
- Checks the condition **before** each iteration.

### `do‑while` loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 3);
```
- Executes the body **at least once** before testing the condition.

---
## 2.3 Controlling Loop Execution
- `break` – exits the nearest enclosing loop.
- `continue` – skips the rest of the current iteration and proceeds to the next.
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) continue; // print only odd numbers
    System.out.println(i);
}
```

---
## 2.4 Nested Control Structures
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i * j + " ");
    }
    System.out.println();
}
```
Produces a 3×3 multiplication table.

---
## 2.5 Practice Problems (Chapter 2)
### Problem 1 – Multiplication Table
**Statement**: Given an integer `n (1 ≤ n ≤ 20)`, print the multiplication table of `n` from `1×n` to `10×n`.
**Input**: Single integer `n`.
**Output**: Ten lines, each line `i * n = result` (e.g., `3 * 4 = 12`).

### Problem 2 – Prime Checker
**Statement**: Determine whether a given integer `p` (> 1) is a **prime** number.
**Input**: One integer `p`.
**Output**: `Prime` if `p` is prime, otherwise `Not Prime`.
*(Hint: loop from `2` to `sqrt(p)` and break early when a divisor is found.)*

### Problem 3 – Reverse Digits
**Statement**: Read an integer `x` (may be negative) and output its digits in reverse order, preserving the sign.
**Input**: One integer `x`.
**Output**: The reversed integer (e.g., input `-123` → output `-321`).

---
## 2.6 How to Test Your Solutions
1. Create a separate `.java` file for each problem, e.g., `MultiplicationTable.java`, `PrimeChecker.java`, `ReverseDigits.java`.
2. Inside `main`, use `Scanner scanner = new Scanner(System.in);` to read input.
3. Compile with `javac <FileName>.java` and run with `java <ClassName>`.
4. Compare the console output with the expected format shown above.

---
Feel free to request a **solution template** for any of the three practice problems, or let me know when you have successfully compiled and run one of them!

