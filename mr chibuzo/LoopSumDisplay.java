import java.util.Scanner;
public class LoopSumDisplay {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

while (true) {
System.out.print("Enter first number: ");
double num1 = scanner.nextDouble();

System.out.print("Enter second number: ");
double num2 = scanner.nextDouble();

System.out.println("Sum: " + (num1 + num2));

System.out.print("do u want to repeat (yes/no): ");
String choice = scanner.next().toLowerCase();

if (!choice.equals("yes")) {
break;
}
}

}
}

