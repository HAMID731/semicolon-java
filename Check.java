import java.util.Scanner;

public class Check{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("Can i greet,\nPlease choose one option \n1. English\n2. Yoruba\n3. Igbo");

int answer = scan.nextInt();

switch(answer){

case 1 :

System.out.println("Hello there");
break;

case 2 :

System.out.println("E kaa bo");
break;

case 3 :

System.out.println("Otutu oma");
break;

}
}}



