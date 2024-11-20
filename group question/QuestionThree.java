import java.util.Scanner;

public class QuestionThree{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	int grade = 0;
	int subject = 0;
	String subject;
	while(grade <= 30){
	
		while(subject <= 5){
			String subject = input.next();	
		}
		int grades;

		System.out.print("Enter subject: "+subject);
		System.out.print("Enter grade : ");
		grade = input.nextInt();
	
		if (grade > 50) {
			System.out.print("pass");
		}else{
			System.out.print("fail");
		}
	}
}}