import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = true;

        if(num <= 1) prime = false;

        for(int i=2;i*i<=num; i++){
            if(num%i==0){
                prime =false;
                break;
            }
        }

        if(prime)
            System.out.println("Prime Number: " + num);
        else
            System.out.println("Not Prime Number: " + num);
    }
}
