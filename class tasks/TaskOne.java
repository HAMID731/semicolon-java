import java.util.Scanner;

public class TaskOne{

	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age = scan.nextInt();

		if(age <= 12){
			System.out.println("CHILD");
		}else if(age >= 13 && age <= 17){
			System.out.println("ADULT");
		}else if(age >= 18 && age <= 64){
			System.out.println("TEEN");
		}else if(age >=65){
			System.out.println("SENIOR");
		}
}}
	

