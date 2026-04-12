import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        // int result;
        for (int i = 1; i <= N; i++) {
            System.out.println("Java is Fun!");
            count = count + i;
        }
        System.out.println("Sum of first N number is: " + count);

    }
}