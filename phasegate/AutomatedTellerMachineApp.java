import java.util.Scanner;

public class AutomatedTellerMachineApp{

	public static void main(String[]args){

		System.out.println("WELCOME TO HAMID ATM APP");

		System.out.println("1. create account \n2. close account\n3. deposit money\n4. withdraw money\n5. check account balance\n6. transfer from one account to another\n7. change pin\n");

		Scanner scan = new Scanner(System.in);
		System.out.print("PICK ANY OPTION 1-7------------------");

		int ATM = scan.nextInt();
		String firstName;
		String secondName ;
		int pin;
		switch(ATM){

		case 1:
			System.out.println("WELCOME MA/SIR");
		
			System.out.print("Enter FirstName: ");
			firstName = scan.nextLine();

			System.out.print("Enter SecondName: ");
			secondName = scan.nextLine();
			System.out.println();
			System.out.println("Enter secured PIN: ");
			pin = scan.nextInt();
			break;
	
		case 2:
			int total = 0;
			System.out.println("How much would u like to deposit ");
			int depositedAmount = scan.nextInt();
	
			total = total + depositedAmount;
			System.out.println(firstName);
			System.out.println(total);
			break;	

		}
}}