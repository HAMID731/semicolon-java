import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        int sum = n +1 +1 +1 +1 +1 +1 +1 +1 +1;

        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}
