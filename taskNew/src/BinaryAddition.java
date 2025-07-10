import java.util.Scanner;

public class BinaryAddition {

    public static String addBinary(String binary1, String binary2) {
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryValue1 = "";
        String binaryValue2 = "";
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the first binary value: ");
            binaryValue1 = scanner.nextLine();
            try {
                Integer.parseInt(binaryValue1, 2); // Attempt to parse to check if it's binary
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid binary input. Please enter a string containing only 0s and 1s.");
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.print("Enter the second binary value: ");
            binaryValue2 = scanner.nextLine();
            try {
                Integer.parseInt(binaryValue2, 2); // Attempt to parse to check if it's binary
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid binary input. Please enter a string containing only 0s and 1s.");
            }
        }

        try {
            String sumOfBinaries = addBinary(binaryValue1, binaryValue2);
            System.out.println("The sum of " + binaryValue1 + " and " + binaryValue2 + " in binary is: " + sumOfBinaries);
        } catch (NumberFormatException e) {
            System.out.println("An unexpected error occurred during binary addition.");
        } finally {
            scanner.close();
        }
    }
}