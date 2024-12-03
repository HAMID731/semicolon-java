import java.util.Scanner;

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
	
	
	for (int student = 1; student < numberOfStudent.length+1; student++){
		for (int subjectOffer = 1; subjectOffer < numberOfSubject.length+1; subjectOffer++){
			int score ;
			System.out.println("\nEntering score for student "+student+"\nEntering score for subject "+ subjectOffer);
			score = scan.nextInt();
			System.out.print("saving >>>>>>>>>>>>>>>> ");
			System.out.print("\nsaved successfully \n");
		}}	
		for (int subjectPrint = 1; subjectPrint < numberOfSubject.length+1; subjectPrint++){
			System.out.print("----------------------------------------------------------------------------------------------\n");
			System.out.print("----------------------------------------------------------------------------------------------\n");
			System.out.print("\nstudent    "+"sub"+numberOfSubject[subjectPrint]+"\t\n");
			System.out.print("----------------------------------------------------------------------------------------------\n");
			
	}



}
	
		
}
			