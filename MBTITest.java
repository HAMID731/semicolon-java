import java.util.Scanner;

public class MBTITest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        String[] questions = {
            "1. (E/I) expend energy, enjoy groups - conserve energy, enjoy one-on-one",
            "2. (S/N) interpret literally - look for meaning and possibilities",
            "3. (T/F) logical, thinking, questioning - empathetic, feeling, accommodating",
            "4. (J/P) organized, orderly - flexible, adaptable",
            "5. (E/I) more outgoing, think out loud - more reserved, think to yourself",
            "6. (S/N) practical, realistic, experiential - imaginative, innovative, theoretical",
            "7. (T/F) candid, straight forward, frank - tactful, kind, encouraging",
            "8. (J/P) plan, schedule - unplanned, spontaneous",
            "9. (E/I) seek many tasks, public activities, interaction with others - seek private, solitary activities with quiet to concentrate",
            "10. (S/N) standard, usual, conventional - different, novel, unique",
            "11. (T/F) firm, tend to criticize, hold the line - gentle, tend to appreciate, conciliate",
            "12. (J/P) regulated, structured - easygoing, 'live' and 'let live'",
            "13. (E/I) external, communicative, express yourself - internal, reticent, keep to yourself",
            "14. (S/N) focus on here-and-now - look to the future, global perspective, big picture",
            "15. (T/F) tough-minded, just - tender-hearted, merciful",
            "16. (J/P) preparation, plan ahead - go with the flow, adapt as you go",
            "17. (E/I) active, initiate - reflective, deliberate",
            "18. (S/N) facts, things, 'what is' - ideas, dreams, 'what could be', philosophical",
            "19. (T/F) matter of fact, issue-oriented - sensitive, people-oriented, compassionate",
            "20. (J/P) control, govern - latitude, freedom"
};

int eiA = 0, eiB = 0;
int snA = 0, snB = 0;
int tfA = 0, tfB = 0;
int jpA = 0, jpB = 0;

System.out.println("Hello, " + name + ". Please answer each question with 'A' or 'B'.");

for (int i = 0; i < 20; i++) {
System.out.print(questions[i] + " ");
String input = scanner.next();

while (!input.equalsIgnoreCase("A") && !input.equalsIgnoreCase("B")) {
System.out.println("I know this is an error, please retry again.");
System.out.print(questions[i] + " ");
input = scanner.next();
}

switch (i + 1) {
case 1, 5, 9, 13, 17 -> {
if (input.equalsIgnoreCase("A")) eiA++;
else eiB++;
}
case 2, 6, 10, 14, 18 -> {
if (input.equalsIgnoreCase("A")) snA++;
else snB++;
}
case 3, 7, 11, 15, 19 -> {
if (input.equalsIgnoreCase("A")) tfA++;
else tfB++;
}
case 4, 8, 12, 16, 20 -> {
if (input.equalsIgnoreCase("A")) jpA++;
else jpB++;
}
}
}
System.out.println("E/I: A = " + eiA + ", B = " + eiB);
System.out.println("S/N: A = " + snA + ", B = " + snB);
System.out.println("T/F: A = " + tfA + ", B = " + tfB);
System.out.println("J/P: A = " + jpA + ", B = " + jpB);
}}
