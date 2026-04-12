import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * PROBLEM 5: Factorial Calculation
         * ---------------------------------
         * Write a program that takes an integer N as input and calculates its factorial
         * (N!).
         * 
         * Requirements:
         * 1. Prompt the user to enter a non-negative integer N.
         * 2. Calculate the factorial using a 'for' loop or 'while' loop.
         * Factorial (N!) = N * (N-1) * (N-2) * ... * 1
         * Example: 5! = 5 * 4 * 3 * 2 * 1 = 120
         * 3. Note: The factorial of 0 (0!) is defined as 1.
         * 4. Use a 'long' data type for the result to handle larger numbers.
         * 5. Display the final result as: "Factorial of N is: [result]"
         */

        System.out.print("Enter a non-negative integer: ");
        int N = sc.nextInt();
        long fact =1;
        for(int i=1;i<=N;i++){
            fact = fact*i;
            // System.out.println(fact);
        }
        System.out.println(fact);
    }
}
