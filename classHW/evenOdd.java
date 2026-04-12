import java.util.*;
class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value % 2 == 0){
            System.out.println("Even number: " + value);
        }else{
            System.out.println("Odd number: " + value);
        }
    }
}
