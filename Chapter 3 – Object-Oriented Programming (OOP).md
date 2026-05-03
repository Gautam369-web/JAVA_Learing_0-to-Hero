
# Chapter 3 – Object-Oriented Programming (OOP)

Welcome to the heart of Java! OOP allows you to model real-world things using **Classes** and **Objects**.

---

## Goals of Chapter 3
- **Model Reality**: Learn to represent real-world entities using Classes and Objects.
- **Master the 4 Pillars**: Deep dive into **Encapsulation, Inheritance, Polymorphism, and Abstraction**.
- **Code Organization**: Understand how to structure code for reusability and security.
- **Initialization**: Learn how to use constructors and the `this` keyword properly.

## Sub-topics
| Section | Topic | Description |
| :--- | :--- | :--- |
| **3.1** | **Classes & Objects** | Fields, Methods, and Instantiation |
| **3.2** | **Constructors & `this`** | Object initialization and current instance reference |
| **3.3** | **Access Modifiers** | `private`, `public`, `protected`, and Encapsulation |
| **3.4** | **Static Members** | Class-level variables and methods |
| **3.5** | **Inheritance** | Code reuse using the `extends` keyword |
| **3.6** | **Polymorphism** | Method Overriding and Dynamic Method Dispatch |
| **3.7** | **Abstraction** | Using `abstract` classes and `interfaces` |

---

## 3.1 Classes and Objects
- **Class**: A blueprint or template (e.g., "Car").
- **Object**: A real instance of that blueprint (e.g., "Your Red Tesla").

### Simple Class Example
```java
class Car {
    String color; // Field (Property)
    String model;

    // Method (Action)
    void drive() {
        System.out.println(model + " is driving!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an Object
        myCar.model = "Tesla Model 3";
        myCar.drive(); // Calling a Method
    }
}
```

---

## 3.2 Constructors
A **Constructor** is a special method used to initialize objects. It has the same name as the class and no return type.

```java
class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }
}
```

---

## 3.3 The `this` Keyword
The `this` keyword refers to the **current object**. It is often used to distinguish between class fields and constructor parameters with the same name.

```java
class Person {
    String name;

    Person(String name) {
        this.name = name; // 'this.name' is the field, 'name' is the parameter
    }
}
```

---

## 3.4 Access Modifiers
These control who can see or use your code:
1. **private**: Visible only within the same class.
2. **default**: Visible only within the same package.
3. **protected**: Visible within the same package and subclasses.
4. **public**: Visible everywhere.

---

## 3.5 Inheritance (`extends`)
Inheritance allows one class (Subclass) to acquire properties and methods of another (Superclass).

```java
class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}
```

---

## 3.6 Polymorphism
Polymorphism means "many forms". It allows a method to do different things based on the object it is acting upon.
- **Method Overriding**: A subclass provides a specific implementation of a method already defined in its superclass.

```java
class Bird {
    void fly() { System.out.println("Flying..."); }
}

class Penguin extends Bird {
    @Override
    void fly() { System.out.println("I can't fly, I swim!"); }
}
```

---

## 3.7 Abstraction (Abstract Classes & Interfaces)
**Abstraction** hides complex implementation details and only shows the necessary features.

### Abstract Class
```java
abstract class Shape {
    abstract void draw(); // No body
}
```

### Interface
```java
interface Camera {
    void takePhoto();
}
```

---

## 3.8 Practice Questions (Chapter 3)

### Problem 9 – Library System (Class & Object)
**Statement**: Create a `Book` class with fields `title`, `author`, and `price`. Add a method `displayDetails()` to print them. Create an object in `main` and display its details.

**Input**: `Java Basics`, `John Doe`, `500`
**Output**: `Title: Java Basics, Author: John Doe, Price: 500`

---

### Problem 10 – Bank Account (Encapsulation)
**Statement**: Create a `BankAccount` class with a `private` field `balance`. Provide `public` methods `deposit(double amount)` and `getBalance()`. Ensure that `deposit` only adds positive amounts.

**Input**: Deposit `100.50`
**Output**: Balance: `100.50`

---

### Problem 11 – Shape Inheritance (Polymorphism)
**Statement**: Create a base class `Shape` with a method `area()`. Create subclasses `Circle` (with radius) and `Square` (with side) that override the `area()` method to return the correct area.

**Input**: Radius `5`, Side `4`
**Output**: 
`Circle Area: 78.5`
`Square Area: 16.0`

---

### Instructions for Solving:
1. Focus on understanding **how classes relate to each other**.
2. Pay attention to **Access Modifiers**—they are key to security in Java.
3. Use the `@Override` annotation for better code clarity.
