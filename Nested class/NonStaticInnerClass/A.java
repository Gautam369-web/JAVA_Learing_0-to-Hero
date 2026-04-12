public class A{
    private int a = 10; // Instance variable
    class B{
        void getValue(){
            System.out.println("Value of a is: " + a);
        }
    }
}

// Main method to test the non-static inner class
public class Test{
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B(); // Creating an instance of the inner class
        b.getValue(); // Calling the method to display the value of a
    }   
}
