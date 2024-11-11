import java.util.Scanner;

public class TaskFive{

	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("1. number1\n2. number2\n3. number3\n4. number4\n5. number5\n6. number6\n7. number7\n Enter Number>>>>>>");

	int answer = scanner.nextInt();

	switch(answer){

		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		case 7:
			System.out.print("Sunday");
			break;
	}
}}