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
