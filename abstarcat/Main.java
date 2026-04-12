abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}

// Abstracted class
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Tommy");
        myDog.makeSound();
    }
}