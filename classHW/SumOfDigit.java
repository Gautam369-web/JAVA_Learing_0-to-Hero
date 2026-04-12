import java.util.*;
class SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = (a/10) + (a%10);
        System.out.print("Sum of Digits: "+sum);
    }
}