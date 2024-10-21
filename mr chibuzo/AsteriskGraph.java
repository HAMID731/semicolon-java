import java.util.Scanner;

public class AsteriskGraph {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
 System.out.println("Enter 5 numbers between 1 and 30:");
int counter = 1;
 if ( counter <= 5 ) {
counter++;
 int number;
  do {
 System.out.print("Number " + counter + ": ");
 number = scanner.nextInt();
 } while (number < 1 && number > 30);
 System.out.println("*");
 }

}}

