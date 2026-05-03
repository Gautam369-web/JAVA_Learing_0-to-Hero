# Chapter 3 – OOP Practice Questions

These questions are designed to test your understanding of Classes, Objects, and the 4 Pillars of OOP.

---

## Problem 9 – Library System (Class & Object)
**Problem Statement**: Create a `Book` class that models a real-world book.
- **Fields**: `title` (String), `author` (String), `price` (double).
- **Method**: `displayDetails()` which prints the book's information.
- **Task**: In your `main` method, create an object of `Book`, set its details, and call `displayDetails()`.

**Sample Test Case**:
- **Input**: `Title: Java Basics`, `Author: John Doe`, `Price: 500`
- **Output**: `Title: Java Basics, Author: John Doe, Price: 500.0`

---

## Problem 10 – Bank Account (Encapsulation)
**Problem Statement**: Create a `BankAccount` class that protects the user's balance.
- **Fields**: `private double balance`.
- **Methods**: 
    - `deposit(double amount)`: Adds money if the amount is positive.
    - `getBalance()`: Returns the current balance.
- **Task**: Try to set the balance directly from the `main` method (this should fail). Then use the `deposit` method and print the final balance.

---

## Problem 11 – Shape Inheritance (Polymorphism)
**Problem Statement**: Use inheritance to calculate areas of different shapes.
- **Base Class**: `Shape` with a method `double area()`.
- **Subclasses**: 
    - `Circle`: Takes `radius` in the constructor. Override `area()` to return `3.14 * r * r`.
    - `Square`: Takes `side` in the constructor. Override `area()` to return `side * side`.
- **Task**: In `main`, create a `Shape` reference pointing to a `Circle` object and another pointing to a `Square` object. Print their areas.

---

## Problem 12 – Employee Payroll (Inheritance & Overriding)
**Problem Statement**: Model a company hierarchy.
- **Base Class**: `Employee` with fields `name`, `id`, and a method `calculateSalary()`.
- **Subclasses**: 
    - `Manager`: Has a fixed base salary + a performance bonus.
    - `Developer`: Has a base salary + an overtime allowance.
- **Task**: Implement `calculateSalary()` in both subclasses to return the total pay. Create objects for both and print their total salaries.

---

## Problem 13 – Payment Gateway (Interface)
**Problem Statement**: Create a system that supports different payment methods.
- **Interface**: `PaymentMethod` with a method `void pay(double amount)`.
- **Implementations**:
    - `CreditCard`: Prints "Paying [amount] using Credit Card."
    - `PayPal`: Prints "Paying [amount] using PayPal."
- **Task**: Use an interface reference to call the `pay()` method for both a Credit Card and a PayPal account.

---

## Problem 14 – School Registry (Static Members)
**Problem Statement**: Keep track of the total number of students in a school.
- **Class**: `Student`.
- **Fields**: `name` (Instance variable), `studentCount` (Static variable).
- **Constructor**: Increment `studentCount` every time a new `Student` object is created.
- **Task**: Create 3 students and print the final `studentCount` using the class name.

---

### Instructions:
1. Create a separate `.java` file for each problem.
2. Remember that **Class names** should start with an Uppercase letter.
3. Don't forget to use `System.out.println()` to see your results!
