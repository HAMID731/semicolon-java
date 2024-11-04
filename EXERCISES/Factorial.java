import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
System.out.print("Enter a nonnegative integer: ");
int n = scanner.nextInt();
int factorial = 1;

if (n < 0) {
System.out.println("Factorial is not defined for negative numbers.");
} else {
for (int i = 1; i <= n; i++) {
factorial *= i;
}
System.out.println(n + "! = " + factorial);
}
}
}
