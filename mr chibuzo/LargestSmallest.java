import java.util.Scanner;

public class LargestSmallest {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int largest = Integer.MIN_VALUE;
int smallest = Integer.MAX_VALUE;
boolean continueInput = true;

while (continueInput) {
System.out.print("Enter a number 0 to stop ");
int number = scanner.nextInt();

if (number == 0) {
continueInput = false;
} else {
largest = Math.max(largest,number);
smallest = Math.min(smallest,number);
}
}
System.out.println("the largest number is:" + largest);
System.out.println("the smallest number is" + smallest);
    }
}
