import java.util.Scanner;

public class Rectangle{
    int perimeter(int l,int b){
        return 2*(l+b);
    }
    int area(int l,int b){
        int pm = perimeter(l,b);
        System.out.println("Perimeter of rectangle: " + pm );
        return l*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangle rect = new Rectangle();
        System.out.println("Area of rectangle: " + rect.area(length, breadth));
        sc.close();
    }
}