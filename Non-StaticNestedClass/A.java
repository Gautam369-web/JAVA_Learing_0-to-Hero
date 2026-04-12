class A{
    private double length;
    private double breadth;
    A(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return length * breadth;
    }
    // Inner inner = new Inner();
    class Inner{
        double r = 10;
        void displayInner(){
            System.out.println("Area of rectangle: " + area());
            System.out.println("Area of circle: " + (3.14 * r * r));
        }
    }
}

class NestedExecution{
    public static void main(String[] args) {
        A a = new A(5, 10);
        // a.inner.displayInner();
        A.Inner inner = a.new Inner();
        inner.displayInner();
        System.out.println("Area of rectangle: " + a.area());
    }
}