interface AreaLambda{
    final float P = 3.14f;
    public abstract double compute(double a, double b);

}

public class TestLambda{
    public static void main(String[] args){
        Area rect = (a,b)->a*b;
        Area tri = (a,b)->0.5*a*b;
        Area circ = (a,b)->Math.PI*a*b;
        System.out.println("Area of rectangle: " + rect.compute(5, 10));
        System.out.println("Area of triangle: " + tri.compute(5, 10));
        System.out.println("Area of circle: " + circ.compute(5, 0));
    }
}