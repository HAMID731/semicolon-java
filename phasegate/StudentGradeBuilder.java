import java.util.Scanner;

public class StudentGradeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many student do you have: \n");
        int students = scanner.nextInt();
        System.out.print("How many student do they offer: \n");
        int subjects = scanner.nextInt();

        int[][] scores = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            System.out.println("Entering score for student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {    
		int score;
                do {
                    System.out.println("Enter score for subject " + (j + 1) + ":");
                    score = scanner.nextInt();
                } while (score < 0 || score > 100);
                scores[i][j] = score;
            }
        }

        System.out.println("\nClass Summary:");
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                total += scores[i][j];
            }
            System.out.println("Total = " + total + ", Average = " + (total / subjects));
        }
    }
}
