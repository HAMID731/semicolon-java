import java.util.Scanner;

public class FloatingPoint{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Input first floating-point number: ");
double num1 = scanner.nextDouble();

System.out.print("Input second floating-point number: ");
double num2 = scanner.nextDouble();

if (Math.round(num1 * 1000) == Math.round(num2 * 1000)) {
System.out.println("They are the same.");
} else {
System.out.println("They are different.");
}
}
}
