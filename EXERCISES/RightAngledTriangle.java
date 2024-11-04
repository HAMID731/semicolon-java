import java.util.Scanner;

public class RightAngledTriangle {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the length of the base of the triangle (between 1 and 10): ");
int baseLength = scanner.nextInt();

if (baseLength < 1 || baseLength > 10) {
System.out.println("Please enter a valid base length between 1 and 10.");
} else {
for (int i = 1; i <= baseLength; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
System.out.println(); 
}
}
}
}
