import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
public static void main(String[] args) {

Random number = new Random();
int numberToGuess = number.nextInt(100) + 1;
       
Scanner scanner = new Scanner(System.in);
        
int guess;
        
while (true) {
System.out.print("Guess a number between 1 and 100: ");
guess = scanner.nextInt();
         
if (guess == numberToGuess) {
System.out.println("Congratulations! You guessed correctly.");
break;
} 

else if (guess > numberToGuess) {
System.out.println("Too high, try again.");
} 
else {
System.out.println("Too low, try again.");
}
}
}
}

