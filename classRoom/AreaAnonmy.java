interface Area{
    final float PI = 3.14f;
    public abstract double compute(double a, double b);
}

class TestAnonmy{
    public static void main(String[] args){
        Area ciclArea = new Area(){
            public double compute(double a, double b){
                return PI*a*b;
            }
        };
        Area recArea = new Area(){
            public double compute(double a, double b){
                return a*b;
            }
        };
        Area triArea = new Area(){
            public double compute(double a, double b){
                return 0.5*a*b;
            }
        };
        System.out.println("Area of circle: " + ciclArea.compute(5, 0));
        System.out.println("Area of rectangle: " + recArea.compute(5, 10));
        System.out.println("Area of triangle: " + triArea.compute(5, 10));
    }
}