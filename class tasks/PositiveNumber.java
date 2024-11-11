import java.util.Scanner;

public class EvenSumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
     System.out.print("Enter the first integer: ");
     int start = scan.nextInt();
        
     int end;
do {
System.out.print("Enter the second integer (greater than the first): ");
end = scan.nextInt();
        } while (end <= start);

int sum = 0;
for (int i = start; i <= end; i++) {
if (i % 2 == 0) {
sum += i;
}
}
System.out.println("Sum of even numbers between " + start + " and " + end + " is: " + sum);
}
}
