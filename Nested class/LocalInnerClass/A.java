public class A{
    void method(){
        class B{
            void display(){
                System.out.println("This is a local inner class.");
            }
        }
        B b = new B();
        b.display();
    }

    // Main method to test the local inner class
    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}

