import java.util.Scanner;

public class problem2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int score = sc.nextInt();
        System.out.println("Sum: "+num1+num2);
        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+num1*num2);
        System.out.println("Quotient: "+num1/num2);
        System.out.println("Remainder: "+num1%num2);
        boolean quality = score>=40?true:false;
        System.out.println("Quality Standard Met: "+quality);

    }
}