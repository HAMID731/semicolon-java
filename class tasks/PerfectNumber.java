import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int sum = 0;
        int i = 1;

        do {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        } while (i <= number / 2);

        if (sum == number) {
           System.out.println(number + " is a perfect number.");
        } else {
           System.out.println(number + " is not a perfect number.");
}
}
}
