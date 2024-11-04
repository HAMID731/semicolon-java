import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int result = 0;

System.out.println("Enter 1 for pass or 2 for fail.");

while (result != 1 && result != 2) {
System.out.print("Enter result (1=pass, 2=fail): ");
result = scanner.nextInt();

if (result != 1 && result != 2) {
System.out.println("Invalid input. Please enter 1 for pass or 2 for fail.");
}
}

System.out.println("Thank you for entering a valid result.");
}
}
