import java.util.Scanner;

class Loan {
    double principal;
    double interestRate;
    int years;

    Loan(double principal, double interestRate, int years) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.years = years;
    }

    double calculateInterest() {
        return (principal * interestRate * years) / 100.0;
    }
}

class CarLoan extends Loan {
    double processingCharge;

    CarLoan(double principal, double interestRate, int years, double processingCharge) {
        super(principal, interestRate, years);
        this.processingCharge = processingCharge;
    }

    double calculateTotalCost() {
        // According to sample output: Total Cost = Interest + Processing Charge
        return calculateInterest() + processingCharge;
    }
}

public class MainCarLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()) {
            double principal = sc.nextDouble();
            double interestRate = sc.nextDouble();
            int years = sc.nextInt();
            double processingCharge = sc.nextDouble();

            CarLoan carLoan = new CarLoan(principal, interestRate, years, processingCharge);
            double interest = carLoan.calculateInterest();
            double totalCost = carLoan.calculateTotalCost();

            System.out.printf("Total Interest: %.2f\n", interest);
            System.out.printf("Total Cost : %.2f\n", totalCost);
        }

        sc.close();
    }
}
