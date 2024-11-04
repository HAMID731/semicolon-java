import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int largest = 0;
        int number;

        while (counter < 10) {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
            counter++;
        }

        System.out.println("The largest number is: " + largest);
    }
}
