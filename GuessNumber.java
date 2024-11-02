import java.util.Scanner;

public class GuessNumber{

public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("Enter your guessed number(0-100)");
int userNumber = input.nextInt();

int guessNumber = 45;

if(userNumber<guessNumber){
		System.out.println("too low, try again");
}else if(userNumber>guessNumber){
		System.out.println("too high, try again");
}else{
		System.out.println("correct!!");
}
}}