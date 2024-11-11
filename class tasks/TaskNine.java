import java.util.Scanner;

public class TaskNine{

	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter department\n1. ice cream\n2. sundea\n3. shake\n Enter Number>>>>>>");

	int answer = scanner.nextInt();

	switch(answer){

	case 1:
			System.out.println("ice cream");
			System.out.print("1. chocholate\n2. vanilla\n3. strawberry\n select>>>>>");
			int answerOne = scanner.nextInt();

			switch(answerOne){

			case 1:
				System.out.print(" you have gotten a chocholate ice ceam");
				break;
			case 2:
				System.out.print("you have gotten a vanilla ice ceam");
				break;

			case 3:
				System.out.print("you have gotten a strawberry ice ceam");
				break;
		
			}break;

	case 2:
			System.out.println("sundea");
			System.out.print("1. chocholate\n2. vanilla\n3. strawberry\n select>>>>>");
			int answerTwo = scanner.nextInt();

			switch(answerTwo){

			case 1:
				System.out.print("you have gotten a chocholate sundea");
				break;
			case 2:
				System.out.print("you have gotten a vanilla sundea");
				break;
			case 3:
				System.out.print("you have gotten a strawberry sundea");
				break;		
			}break;

	case 3:
			System.out.println("shake");
			System.out.print("1. chocholate\n2. vanilla\n3. starwberry\n select>>>>>");
			int answerThree = scanner.nextInt();

			switch(answerThree){

			case 1:
				System.out.print("you have gotten a chocholate shake");
				break;

			case 2:
				System.out.print("you have gotten a vanilla shake");
				break;
			case 3:
				System.out.print("you have gotten a strawberry shake");
				break;
		
			}break;

		
	}
}}