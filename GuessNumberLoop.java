import java.util.Scanner;

public class GuessNumberLoop{

public static void main(String[]args){

Scanner input = new Scanner(System.in);
int userNumber ;

int guessNumber;
do{
System.out.println("Enter your guessed number(0-100)");

userNumber = input.nextInt();

guessNumber = 45;

if(userNumber < guessNumber){
		System.out.println("too low, try again");
}else if(userNumber>guessNumber){
		System.out.println("too high, try again");
}else{
		System.out.println("correct!!");
}
}while(userNumber != guessNumber);
}}