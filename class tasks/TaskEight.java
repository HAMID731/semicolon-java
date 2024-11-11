import java.util.Scanner;

public class TaskEight{

	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter grade\n1. math\n2. science\n3. History\n Enter Number>>>>>>");

	int answer = scanner.nextInt();

	switch(answer){

	case 1:
			System.out.println("math");
			System.out.print("1. freshmen\n2. sophomore\n3. junior\n4. senior\n select>>>>>");
			int answerOne = scanner.nextInt();

			switch(answerOne){

			case 1:
				System.out.print(" you are studing math and are a freshman");
				break;
			case 2:
				System.out.print(" you are studing math and are a sophomore");
				break;

			case 3:
				System.out.print("you are studing math and are a junior");
				break;
			case 4:
				System.out.print("you are studing math and are a senior");
				break;
		
			}break;

	case 2:
			System.out.println("science");
			System.out.print("1. freshmen\n2. sophomore\n3. junior\n4. senior\n select>>>>>");
			int answerTwo = scanner.nextInt();

			switch(answerTwo){

			case 1:
				System.out.print(" you are studing science and are a freshman");
				break;
			case 2:
				System.out.print(" you are studing science and are a sophomore");
				break;

			case 3:
				System.out.print("you are studing science and are a junior");
				break;
			case 4:
				System.out.print("you are studing science and are a senior");
				break;
	
			}break;

	case 3:
			System.out.println("history");
			System.out.print("1. freshmen\n2. sophomore\n3. junior\n4. senior\n select>>>>>");
			int answerThree = scanner.nextInt();

			switch(answerThree){

			case 1:
				System.out.print(" you are studing history and are a freshman");
				break;
			case 2:
				System.out.print(" you are studing history and are a sophomore");
				break;

			case 3:
				System.out.print("you are studing history and are a junior");
				break;
			case 4:
				System.out.print("you are studing history and are a senior");
				break;

		
			}break;

		
	}
}}