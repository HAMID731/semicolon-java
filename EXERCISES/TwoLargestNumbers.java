import java.util.Scanner;

public class TwoLargestNumbers {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

double largest = 0;
double secondLargest = 0;

System.out.println("Enter 10 numbers:");

for (int i = 1; i <= 10; i++) {
System.out.print("Enter number " + i + ": ");
double number = input.nextDouble();

if (number > largest) {
secondLargest = largest;
largest = number;
} else if (number > secondLargest) {
secondLargest = number;
}
}
System.out.println("The largest number is: " + largest);
System.out.println("The second largest number is: " + secondLargest);

}
}
