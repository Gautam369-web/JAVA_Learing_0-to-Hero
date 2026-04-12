class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

class SingleInheritance{
    public static void main(String[] arg){
        Dog d = new Dog();
        // d.eat();
        d.bark();
        d.eat();
    }
}