class A {
    int j, k;

    final void displayA() {
        System.out.println("J = " + j + " K = " + k);
    }
}

class B extends A {
    int m;

    void displayB() {
        int product = m * j * k;
        System.out.println("Product of J, K and M is: " + product);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.j = 5;
        a.k = 10;
        a.displayA();
        B b = new B();
        b.j = 5;
        b.k = 10;
        b.m = 2;
        b.displayB();
    }
}