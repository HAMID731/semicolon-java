import java.util.Scanner;

public class PalindromeChecker {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

while (true) {
System.out.print("Enter a five-digit integer: ");
int number = scanner.nextInt();
int digit1 = number / 10000;
int digit2 = (number / 1000) % 10;
int digit3 = (number / 100) % 10;
int digit4 = (number / 10) % 10;
int digit5 = number % 10;

if (digit1 == digit5 && digit2 == digit4) {
System.out.println(number + " is a palindrome.");
} else {
System.out.println(number + " is not a palindrome.");
}

break; 

}
}
}
