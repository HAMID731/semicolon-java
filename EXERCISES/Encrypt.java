import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int number = scanner.nextInt();
        int d0 = (number / 1000 + 7) % 10;
        int d1 = (number / 100 % 10 + 7) % 10;
        int d2 = (number / 10 % 10 + 7) % 10;
        int d3 = (number % 10 + 7) % 10;
        int encryptedNumber = d2 * 1000 + d3 * 100 + d0 * 10 + d1;
        System.out.println("Encrypted number: " + encryptedNumber);
    }
}
