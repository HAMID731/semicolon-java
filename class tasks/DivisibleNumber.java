import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();
        
        for (int i = lower; i <= upper; i++) {
            if (i % 7 == 0 && i % 13 == 0) {
                System.out.println("The first number divisible by both 7 and 13 is: " + i);
                break;
}
}
        
        System.out.println("No number divisible by both 7 and 13 was found in the range.");
}
}
