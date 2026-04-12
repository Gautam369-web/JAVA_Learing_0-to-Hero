public class A{
    static class B{
        void display(){
            System.out.println("This is a static nested class.");
        }
    }
}

// Main method to test the static nested class
public class Test {
    public static void main(String[] args) {
        A.B b = new A.B();
        b.display();
    }
}