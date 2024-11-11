import java.util.Scanner;

public class TaskSix{

	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("1. Rank1\n2. Rank2\n3. Rank3\n4. Rank4\n Enter Number>>>>>>");

	int answer = scanner.nextInt();

	switch(answer){

		case 1:
			System.out.print("Gold Medal");
			break;
		case 2:
			System.out.print("Silver Medal");
			break;
		case 3:
			System.out.print("Bronze Medal");
			break;
		case 4:
			System.out.print("Participant Ribon");
			break;
	}
}}