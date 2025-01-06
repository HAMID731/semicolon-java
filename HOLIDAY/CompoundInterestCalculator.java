import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter the monthly contribution amount (use negative for withdrawals): ");
        double monthlyContribution = scanner.nextDouble();

        System.out.print("Enter the length of time in years: ");
        int years = scanner.nextInt();

        System.out.print("Enter the estimated annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the compound frequency (e.g., 365 for daily, 12 for monthly): ");
        int compoundFrequency = scanner.nextInt();

        int totalMonths = years * 12;
        double interestRatePerPeriod = (annualInterestRate / 100) / compoundFrequency;
        double balance = initialInvestment;

        for (int month = 1; month <= totalMonths; month++) {
            balance += monthlyContribution;
            balance *= Math.pow(1 + interestRatePerPeriod, (double) compoundFrequency / 12);
        }

        System.out.printf("Final balance after %d years: $%.2f%n", years, balance);
    }
}