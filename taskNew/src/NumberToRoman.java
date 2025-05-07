import java.util.Scanner;

public class NumberToRoman {

    public static String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "Invalid input: Number must be between 1 and 3999";
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 3999: ");
        try {
            int number = scanner.nextInt();
            String romanNumeral = intToRoman(number);
            System.out.println("The Roman numeral for " + number + " is: " + romanNumeral);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}