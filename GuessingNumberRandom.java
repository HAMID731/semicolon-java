import java.util.Random;
import java.util.Scanner;

public class GuessingNumberRandom {

public static void main(String[] args) {

Random number = new Random();
		int guessNumber = number.nextInt(100);
Scanner input = new Scanner(System.in);
		int userNumber ;
do{
	System.out.println("Enter your guessed number(0-100)");

	userNumber = input.nextInt();


	if(userNumber < guessNumber){
			System.out.println("too low, try again");
	}else if(userNumber>guessNumber){
			System.out.println("too high, try again");
	}else{
			System.out.println("correct!!");
	}
}while(userNumber != guessNumber);
}}