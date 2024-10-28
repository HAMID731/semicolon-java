import java.util.Scanner;

public class AdditionProgram {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
char repeat;

do {
System.out.print("Enter first number: ");
double num1 = scanner.nextDouble();

System.out.print("Enter second number: ");
double num2 = scanner.nextDouble();

double sum = num1 + num2;
System.out.println("Sum: " + sum);

System.out.print("Do you want to repeat? (y/n): ");
repeat = scanner.next().charAt(0);
}
 while (repeat == 'y' || repeat == 'Y');
}
}
