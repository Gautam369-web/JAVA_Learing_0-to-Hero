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

---

## 3.1 Classes & Objects: The Blueprint and the Reality

### 🏠 Real-Life Analogy
Imagine an **Architect's Blueprint** for a house. 
- The **Blueprint** itself isn't a house. You can't live in it, it doesn't have actual walls, and it doesn't take up space in a neighborhood. It just describes *what* a house should look like (number of rooms, color, dimensions). This is the **CLASS**.
- When a builder uses that blueprint to actually build a physical house on a plot of land, that physical house is an **OBJECT** (or an "Instance"). You can have many houses built from the same blueprint—each might have different residents or furniture, but they all follow the same basic structure.

### 💡 Human Understanding
- **Class**: It's a template. It defines **Attributes** (what it is/has) and **Behaviors** (what it does).
- **Object**: It's the actual thing created in the computer's memory based on the template.

### 💻 Code Implementation: The "Smartphone" Example
Let's define a class for a Smartphone and then create actual phone objects.

```java
// This is the CLASS (The Blueprint)
class Smartphone {
    // Attributes (State/Fields)
    String brand;
    String model;
    int batteryLevel;

    // Behaviors (Methods/Actions)
    void makeCall(String personName) {
        System.out.println("Calling " + personName + " from my " + model + "...");
    }

    void checkBattery() {
        System.out.println("Battery is at: " + batteryLevel + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an OBJECT (The Reality)
        Smartphone myPhone = new Smartphone(); 
        
        // Setting values (Giving the object a 'state')
        myPhone.brand = "Apple";
        myPhone.model = "iPhone 15";
        myPhone.batteryLevel = 85;

        // Using the object (Performing 'actions')
        myPhone.makeCall("Dad");
        myPhone.checkBattery();

        // Creating ANOTHER object from the SAME blueprint
        Smartphone yourPhone = new Smartphone();
        yourPhone.brand = "Samsung";
        yourPhone.model = "Galaxy S23";
        yourPhone.batteryLevel = 40;
        
        yourPhone.checkBattery();
    }
}
```

### 🔍 How it Works:
1.  **`class Smartphone { ... }`**: This tells Java, "Hey, if I ever ask for a Smartphone, this is what it looks like."
2.  **`Smartphone myPhone`**: This declares a variable named `myPhone`. It doesn't create the phone yet; it just says `myPhone` is for storing a Smartphone.
3.  **`new Smartphone()`**: This is the magic part! The `new` keyword tells Java to actually go into the computer's memory and "build" the phone object.
4.  **The `.` (Dot Operator)**: We use `myPhone.model` to access things "inside" the object. It's like saying "Go to `myPhone` and look at its `model`."

---

## 3.2 Constructors & `this`: The "Birth" of an Object

### 👶 Real-Life Analogy
When a baby is born, they are usually given a **name** and **identity** immediately. You don't create a baby and then wait 10 days to decide what their name is. 
A **Constructor** is like the "Birth Certificate" process. It's a special block of code that runs the *exact moment* an object is created to set up its initial information.

### 💡 Human Understanding
- **Constructor**: A method that has the **same name as the class** and **no return type**. It "constructs" the object.
- **`this` Keyword**: It's a way for an object to point to itself. Imagine you are wearing a name tag that says "Me". When you say "My name is...", you are referring to yourself. In code, `this.name` means "The name that belongs to this specific object."

### 💻 Code Implementation
```java
class Student {
    String name;
    int age;

    // CONSTRUCTOR: Runs when 'new Student()' is called
    Student(String name, int age) {
        // Using 'this' to distinguish between the class field and the parameter
        this.name = name; 
        this.age = age;
        System.out.println("A new student object is born!");
    }

    void introduce() {
        System.out.println("Hi, I am " + this.name + " and I am " + this.age + " years old.");
    }
}

public class School {
    public static void main(String[] args) {
        // We pass the data directly during 'new'
        Student s1 = new Student("Alice", 20); 
        Student s2 = new Student("Bob", 22);

        s1.introduce();
        s2.introduce();
    }
}
```

### 🔍 How it Works:
1.  **`Student(String name, int age)`**: Because this looks like a method but has no `void` or `int` return type and matches the class name, Java knows it's a Constructor.
2.  **`this.name = name;`**: This is very common. The constructor receives a variable called `name`. We want to save that into the object's own `name` field. `this.name` is the one at the top of the class; `name` is the one in the parentheses.
3.  **No more manual setting**: Notice we didn't have to do `s1.name = "Alice"` in the main method. The constructor handled it for us in one line!

---

---

## 3.3 Access Modifiers: The "Privacy Settings" (Encapsulation)

### 🔒 Real-Life Analogy
Think of your **Smartphone** again.
- **Public**: The screen and buttons. Anyone can see the screen or press the volume button.
- **Private**: The internal processor and battery. You can't touch them directly, and you shouldn't! If you want to "change" the battery level, you don't reach inside; you use a "Public" method: **the Charging Port**.

### 💡 Human Understanding
**Encapsulation** is about bundling data (fields) and methods together and **hiding** the internal details. We use **Access Modifiers** to do this:
1.  **`private`**: Only the current class can see it. (The "Vault")
2.  **`public`**: Anyone can see it. (The "Front Door")
3.  **Getters and Setters**: These are public methods that let people *safely* look at or change private data.

### 💻 Code Implementation: The "Bank Account"
```java
class BankAccount {
    // Private data - hidden from the outside world
    private double balance;

    // CONSTRUCTOR
    BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    // SETTER: A safe way to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // GETTER: A safe way to check the balance
    public double getBalance() {
        return balance;
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(500);

        // myAcc.balance = 1000000; // ERROR! Cannot access private field directly
        
        myAcc.deposit(200); // Safe way to change the balance
        System.out.println("Current Balance: $" + myAcc.getBalance());
    }
}
```

---

## 3.4 Static Members: The "Shared Bulletin Board"

### 📌 Real-Life Analogy
Imagine a classroom.
- Each student has their own **Notebook** (Instance Variable). What one student writes in their notebook doesn't appear in anyone else's.
- However, there is one **Blackboard** (Static Variable) at the front. If the teacher writes "Holiday Tomorrow" on it, *every* student sees the same message. It belongs to the **Class**, not to any specific student.

### 💡 Human Understanding
- **`static`**: This keyword means the variable or method belongs to the **Class** itself, not to any object. All objects of that class share the exact same copy of a static member.

### 💻 Code Implementation
```java
class Student {
    String name; // Unique for every student
    static String schoolName = "Global High School"; // Shared by all students

    Student(String name) {
        this.name = name;
    }

    void showDetails() {
        System.out.println("Student: " + name + ", School: " + schoolName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.showDetails();
        s2.showDetails();

        // If we change the school name ONCE...
        Student.schoolName = "Elite Academy";

        // ...it changes for EVERYONE!
        s1.showDetails();
        s2.showDetails();
    }
}
```

---

## 3.5 Inheritance: The "DNA" (Code Reuse)

### 🧬 Real-Life Analogy
You inherit traits from your parents (eye color, height). You don't have to "re-invent" how to have eyes; you just get that from your parents and then add your own unique personality. 
In Java, **Inheritance** lets a new class get all the features of an existing class automatically.

### 💡 Human Understanding
- **Superclass (Parent)**: The existing class.
- **Subclass (Child)**: The new class that "extends" the parent.
- **`super` keyword**: Used by the child to call the parent's constructor or methods.

### 💻 Code Implementation
```java
// Parent Class
class Vehicle {
    String brand = "Generic";
    void honk() {
        System.out.println("Beep Beep!");
    }
}

// Child Class
class Car extends Vehicle {
    int doors = 4;
    
    void display() {
        System.out.println("Brand: " + brand + ", Doors: " + doors);
    }
}

public class Test {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk(); // Inheritance! Car can honk because Vehicle can.
        myCar.display();
    }
}
```

---

## 3.6 Polymorphism: "One Name, Many Forms"

### 🎭 Real-Life Analogy
Think of the word **"Play"**.
- If I say "Play a song," you start music.
- If I say "Play a game," you start a sport.
- The command is the same ("Play"), but the **action** depends on what you are playing.

### 💡 Human Understanding
**Polymorphism** allows us to perform a single action in different ways. The most common form is **Method Overriding** (where a child class changes how a parent's method works).

### 💻 Code Implementation
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow!");
    }
}
```

---

## 3.7 Abstraction: The "Remote Control"

### 📺 Real-Life Analogy
When you use a **TV Remote**, you press the "Power" button. 
- You don't need to know the complex circuitry inside the TV or how the signal travels through the air. 
- The remote is an **Interface** that hides all the "Internal Mess" and gives you a simple way to interact.

### 💡 Human Understanding
**Abstraction** means showing only the essential features and hiding the background details.
- **Abstract Class**: A class that cannot be used to create objects directly. It serves as a strict template for others.
- **Interface**: A complete contract. It says "You MUST implement these behaviors."

### 💻 Code Implementation (Interface)
```java
interface Camera {
    void takePhoto(); // No body, just a "Promise"
}

class Smartphone implements Camera {
    public void takePhoto() {
        System.out.println("Click! Photo taken on smartphone.");
    }
}
```

---

## 3.8 Practice Questions (Chapter 3)


