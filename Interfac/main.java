interface Area {
    public final float pi = 3.14f; // constant
    public abstract float compute (float a, float b); // abstract method

}
class Circle implements Area {
    public float compute(float a, float b) {
        return pi * a * a; 
    }
}
class Rectangle implements Area {
    public float compute(float a, float b) {
        return a * b; 
    }
}
public class main {
    public static void main(String[] args) {
        Area c = new Circle();
        Area r = new Rectangle();   
        System.out.println("Area of circle  " + c.compute(5, 0));
        System.out.println("Area of rectangle " + r.compute(4, 6));
    }
}