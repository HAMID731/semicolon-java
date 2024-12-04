import java.util.Scanner;
import java.util.ArrayList;
public class StudentGradeBuilder{

public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	System.out.println("How many student do you have: ");
	int number = scan.nextInt();
	System.out.println("How many subject do they offer: ");
	int  subject= scan.nextInt();

	int[] numberOfSubject = new int[subject];
	int[] numberOfStudent = new int[number];
	System.out.print("saving >>>>>>>>>>>>>>>> ");
	System.out.print("\nsaved successfully ");
	System.out.println();
	ArrayList<Integer> list = new ArrayList<Integer>();

	for (int student = 1; student < numberOfStudent.length+1; student++){

		for (int subjectOffer = 1; subjectOffer < numberOfSubject.length+1; subjectOffer++){

			int score ;
			System.out.println("\nEntering score for student "+student+"\nEntering score for subject "+ subjectOffer);
			score = scan.nextInt();
			list.add(score);
			System.out.print("saving >>>>>>>>>>>>>>>> ");
			System.out.print("\nsaved successfully \n");
		for (int i = 0; i < list.size(); i++) {
			System.out.print("----------------------------------------------------------------------------------------------\n");
			System.out.print("----------------------------------------------------------------------------------------------\n");
			getSubject(subjectOffer);
			System.out.print("----------------------------------------------------------------------------------------------\n");

		}

		}
		
		}

	
}
	public static void getSubject(int subject){
		int[] numberOfSubject = new int[subject];
		for (int subjectOffer = 1; subjectOffer < numberOfSubject.length+1; subjectOffer++){
			System.out.print("sub"+subjectOffer+1);
		}
}
	
		
}
			