import java.util.Scanner;

public class Comparator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first number: ");
double number1 = scanner.nextDouble();
System.out.print("Enter the second number: ");
double number2 = scanner.nextDouble();

if (number1 == number2) {
System.out.println(0);
} else if (number1 > number2) {
System.out.println(1);
} else {
System.out.println(-1);
}
}
}
