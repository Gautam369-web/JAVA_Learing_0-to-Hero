class Outer{
    private double length;
    private double breadth;
    Outer(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return length * breadth;
    }
    // Inner inner = new Inner();
    class Inner{
        int r;
        Inner(int r){
            this.r = r;
        }
        Inner(){
            this.r = 12;
        }
        void displayInner(){
            // System.out.println("Area of rectangle: " + area());
            System.out.println("The cost of fencing: " + r * 2 * (length + breadth));
        }
    }
}

class NestedExecution{
    public static void main(String[] args) {
        Outer outer = new Outer(30,20);
        System.out.println("The area of rectangle: " + outer.area());
        
        // outer.inner.displayInner();
        Outer.Inner inner1= outer.new Inner(15);
        inner1.displayInner();
        Outer obj = new Outer(20,10);
        Outer.Inner inner2 = obj.new Inner();
        inner2.displayInner();
        System.out.println("Obj_Area= " + obj.area());
    }
}