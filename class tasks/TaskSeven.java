import java.util.Scanner;

public class TaskSeven{

	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter department\n1. IT\n2. HR\n3. Finance\n Enter Number>>>>>>");

	int answer = scanner.nextInt();

	switch(answer){

	case 1:
			System.out.println("IT");
			System.out.print("1. Manager\n2. Analyst\n3. Intern\n select>>>>>");
			int answerOne = scanner.nextInt();

			switch(answerOne){

			case 1:
				System.out.print(" Manager of the it department");
				break;
			case 2:
				System.out.print("Analyst of the it department");
				break;

			case 3:
				System.out.print("Intern of the it department");
				break;
		
			}break;

	case 2:
			System.out.println("HR");
			System.out.print("1. Manager\n2. Analyst\n3. Intern\n select>>>>>");
			int answerTwo = scanner.nextInt();

			switch(answerTwo){

			case 1:
				System.out.print("manager of the HR department");
				break;
			case 2:
				System.out.print("Analyst of the HR department");
				break;
			case 3:
				System.out.print("Intern of the HR department");
				break;		
			}break;

	case 3:
			System.out.println("Finance");
			System.out.print("1. Manager\n2. Analyst\n3. Intern\n select>>>>>");
			int answerThree = scanner.nextInt();

			switch(answerThree){

			case 1:
				System.out.print("manager of the finance department");
				break;

			case 2:
				System.out.print("Analyst of the finance department");
				break;
			case 3:
				System.out.print("Intern of the finance department");
				break;
		
			}break;

		
	}
}}