import java.util.Scanner;

public class ATMApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName, lastName, pin;
		double balance = 0.0;

		System.out.print("Enter your first name: ");
		firstName = input.next();
		System.out.print("Enter your last name: ");
		lastName = input.next();
		System.out.print("Set your PIN: ");
		pin = input.next();

		System.out.println("\nAccount created for " + firstName + " " + lastName + "!");

		while (true) {
			System.out.println("\nATM Menu:");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = input.nextInt();

			if (choice == 1) {
				System.out.print("Enter deposit amount: ");
				double deposit = input.nextDouble();
				balance += deposit;
				System.out.println("Deposit successful! New balance: $" + balance);
			} else if (choice == 2) {
				System.out.print("Enter withdrawal amount: ");
				double withdrawal = input.nextDouble();
				if (withdrawal > balance) {
					System.out.println("Insufficient funds!");
				} else {
					balance -= withdrawal;
					System.out.println("Withdrawal successful! New balance: $" + balance);
				}
			} else if (choice == 3) {
				System.out.println("Your current balance is: $" + balance);
			} else if (choice == 4) {
				System.out.println("Thank you for using our ATM!");
				break;
			} else {
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
