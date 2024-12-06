import java.util.Scanner;

public class MBTITest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	 String personalityType = "";
        System.out.print("What is your name? ");
        String name = scanner.nextLine();


         System.out.println("Hello, " + name + ". Please answer each question with 'A' or 'B'.");

        String[] questionsForExtrovertVsIntrovert = {
            "\n1. (E/I) expend energy, enjoy groups - conserve energy, enjoy one-on-one",
            "2. (E/I) seek many tasks, public activities, interaction with others - seek private, solitary activities with quiet to concentrate",
	    "3. (E/I) more outgoing, think out loud - more reserved, think to yourself",
            "4. (E/I) external, communicative, express yourself - internal, reticent, keep to yourself",
            "5. (E/I) active, initiate - reflective, deliberate"};
		
	    int eiA = 0, eiB = 0;
	    int snA = 0, snB = 0;
	    int tfA = 0, tfB = 0;
            int jpA = 0, jpB = 0;

	    
	    for (int i = 0; i < 5; i++) {
            	System.out.print(questionsForExtrovertVsIntrovert[i] + " ");
            	String input = scanner.next();

            while (!input.equalsIgnoreCase("A") && !input.equalsIgnoreCase("B")) {
                System.out.println("Invalid input. Please retry.");
                System.out.print(questionsForExtrovertVsIntrovert[i] + " ");
                input = scanner.next();
            }
	    switch (i + 1) {
		 case 1: case 2: case 3: case 4: case 5:
                    if (input.equalsIgnoreCase("A")) eiA++;
                    else eiB++;
                    break;
             }
             }

	 	personalityType += (eiA >= eiB) ? "E" : "I";
	 	System.out.println("E/I: A = " + eiA + ", B = " + eiB);

	 String[] questionsForSensingVsIntuitive = {
            "\n6. (S/N) interpret literally - look for meaning and possibilities",
	    "7. (S/N) practical, realistic, experiential - imaginative, innovative, theoretical",
	    "8. (S/N) standard, usual, conventional - different, novel, unique",
	    "9. (S/N) focus on here-and-now - look to the future, global perspective, big picture",
	    "10. (S/N) facts, things, 'what is' - ideas, dreams, 'what could be', philosophical",};

	   
            for (int j = 0; j < 5; j++) {
            	System.out.print(questionsForSensingVsIntuitive[j] + " ");
            	String input = scanner.next();

            while (!input.equalsIgnoreCase("A") && !input.equalsIgnoreCase("B")) {
                System.out.println("Invalid input. Please retry.");
                System.out.print(questionsForSensingVsIntuitive[j] + " ");
                input = scanner.next();
            }

	    switch (j + 1) {
		 case 1: case 2: case 3: case 4: case 5:
                    if (input.equalsIgnoreCase("A")) snA++;
                    else snB++;
                    break;
               }
               }              

 		personalityType += (snA >= snB) ? "S" : "N";
	        System.out.println("S/N: A = " + snA + ", B = " + snB);


         String[] questionsForThinkingVsFelling = {
            "\n11. (T/F) logical, thinking, questioning - empathetic, feeling, accommodating",
            "12. (T/F) candid, straight forward, frank - tactful, kind, encouraging",
            "13. (T/F) firm, tend to criticize, hold the line - gentle, tend to appreciate, conciliate",
            "14. (T/F) tough-minded, just - tender-hearted, merciful",
	    "15. (T/F) matter of fact, issue-oriented - sensitive, people-oriented, compassionate",};

	     for (int k = 0; k < 5; k++) {
             	System.out.print(questionsForThinkingVsFelling[k] + " ");
             	String input = scanner.next();

            while (!input.equalsIgnoreCase("A") && !input.equalsIgnoreCase("B")) {
                System.out.println("Invalid input. Please retry.");
                System.out.print(questionsForThinkingVsFelling[k] + " ");
                input = scanner.next();
            }


	    switch (k + 1) {
		 case 1: case 2: case 3: case 4: case 5:
                    if (input.equalsIgnoreCase("A")) tfA++;
                    else tfB++;
                    break;
               }
            }
		personalityType += (tfA >= tfB) ? "T" : "F";
		System.out.println("T/F: A = " + tfA + ", B = " + tfB);


        String[] questionsForJudgingVsPerceptive = {
            "\n16. (J/P) organized, orderly - flexible, adaptable",
	    "17. (J/P) plan, schedule - unplanned, spontaneous",
            "18. (J/P) regulated, structured - easygoing, 'live' and 'let live'",
            "19. (J/P) preparation, plan ahead - go with the flow, adapt as you go",
            "20. (J/P) control, govern - latitude, freedom"};


	    for (int l = 0; l < 5; l++) {
            	System.out.print(questionsForJudgingVsPerceptive[l] + " ");
            	String input = scanner.next();

            while (!input.equalsIgnoreCase("A") && !input.equalsIgnoreCase("B")) {
                System.out.println("Invalid input. Please retry.");
                System.out.print(questionsForJudgingVsPerceptive[l] + " ");
                input = scanner.next();
            }


	   switch (l + 1) {
		 case 1: case 2: case 3: case 4: case 5:
                    if (input.equalsIgnoreCase("A")) jpA++;
                    else jpB++;
                    break;
               }
           }

		personalityType += (jpA >= jpB) ? "J" : "P";
        	System.out.println("J/P: A = " + jpA + ", B = " + jpB);


        System.out.println("\n" + name + ", your MBTI personality type is: " + personalityType);

           }
}
