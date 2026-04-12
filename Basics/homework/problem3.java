import java.util.Scanner;
public class problem3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age<0){
            System.out.println("Invalid Age");
        }else if(age<13){
            System.out.println("Ticket Price: $5");
        }else if(age>=13 && age <=64){
            System.out.println("Ticket Price: $12");
        }else{
            System.out.println("Ticket Price: $8");
        }

    
    }
}