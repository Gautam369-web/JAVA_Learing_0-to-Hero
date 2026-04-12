import java.util.*;
public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev =0;
        int temp = a;
        while(a!=0){
            rev = rev*10 + a%10;
            a = a/10;
        }
        if(rev == temp){
            System.out.print("Yes Palindrom: "+temp);
        }else{
            System.out.print("Not Palindrom: "+temp);
        }

    }
}
