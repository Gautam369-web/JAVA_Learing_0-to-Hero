import java.util.Scanner;

class Reverce{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        while(a!=0){
            rev = rev*10 + a%10; //4 ,45
            a = a/10; //5 , 0
        }
        System.out.print("Reverce number: "+rev);  
    }
}