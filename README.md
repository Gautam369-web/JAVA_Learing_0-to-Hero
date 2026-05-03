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
