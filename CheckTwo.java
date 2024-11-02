import java.util.Scanner;

public class CheckTwo{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("Can i greet,\nPlease choose one option \n1. English\n2. Yoruba\n3. Igbo");

int answer = scan.nextInt();

switch(answer){

case 1 :

	System.out.println("Hello there");
		System.out.println("1. Morning\n2. Afternoon\n3. Evening");
		int answerOne = scan.nextInt();

		switch(answerOne){

		case 1 :
		System.out.println("Good morning");
		break;
		case 2 :
		System.out.println("Good Afternoon");
		break;
		case 3 :
		System.out.println("Good Evening");
		break;
		}
                break;


case 2 :

System.out.println("E kaa bo");
System.out.println("1. Morning\n2. Afternoon\n3. Evening");
		int answerTwo = scan.nextInt();

		switch(answerTwo){

		case 1 :
		System.out.println("E kaa ro");
		break;
		case 2 :
		System.out.println("E kaa san");
		break;
		case 3 :
		System.out.println("Ekurale");
		break;
		}
                break;


case 3 :

System.out.println("Otutu oma");
System.out.println("1. Morning\n2. Afternoon\n3. Evening");
		int answerThree = scan.nextInt();

		switch(answerThree){

		case 1 :
		System.out.println("Good morning");
		break;
		case 2 :
		System.out.println("Good Afternoon");
		break;
		case 3 :
		System.out.println("Good Evening");
		break;
		}
                break;


}

}}



