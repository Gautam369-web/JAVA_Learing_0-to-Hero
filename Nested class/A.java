public class A{
    int a = 10;
    class B{
        void display(){
            System.out.println("Value of a is: " + a);
        }
    }
    // Main method to test the nested class
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.display();
    }
}