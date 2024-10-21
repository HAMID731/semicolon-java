import java.util.Scanner;

public class PowerCalculator {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter base number: ");
double base = scanner.nextDouble();

 System.out.print("Enter exponent: ");
 int exponent = scanner.nextInt();

double sum = base * base * exponent /2;


 System.out.print("the square ="+sum);
}
}

 

