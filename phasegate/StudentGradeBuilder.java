import java.util.Scanner;

public class StudentGradeBuilder{

public static void main(String[]args){
Scanner scan = new Scanner(System.in);
int teacher = scan.nextInt();
getNumberOfStudent(teacher);
}

	public static void getNumberOfStudent(int number){
		int[] numberOfStudent = new int[number];
		
		for (int student = 1; student < numberOfStudent.length; student++){
			System.out.println("student"+student);

		}
	 }

	
		
}
			