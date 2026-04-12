import java.io.*;
class ClassA {  // outer class
    class ClassB {
        // Method of Non-static nested class
        void get()
        {
            // Execution command of get() method
            System.out.println("Hello");
        }
    }
}
class TestSimpleInner {
    public static void main(String[] args)
    {
        // Creating object of Class 1 in main() method
        ClassA ob1 = new ClassA();
        // Creating object of non-static nested class in main()
        ClassA.ClassB ob2 = ob1.new ClassB();
        // Calling non-static nested class method in main() method
        ob2.get();
    }
}
