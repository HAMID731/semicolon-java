import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();

        int sum = 0;

       
        do {
            int sum1 = number % 10;
            int sum2 = number / 100;
	    int not = number % 100;
            int sum3 = not / 10;
            int sum4 = sum1 + sum2 + sum3;
	    sum += sum4;
      } while (number > 0);
 System.out.println("Sum of the digits is: " + sum);
  
}
}
