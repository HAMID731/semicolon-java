import java.util.Scanner;

public class HighestAndLow {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
char input; 
double highest = Double.NEGATIVE_INFINITY;
double lowest = Double.POSITIVE_INFINITY;

System.out.println("Enter a number (or 'exit' to stop):");
double number = scanner.nextDouble();

do {

input = scanner.next().charAt(0);
} while (input == 'y'); 

if (number > highest) {
highest = number;
} else if (number < lowest) {
lowest = number;
}

System.out.println("Highest number: " + highest);
System.out.println("Lowest number: " + lowest);
}
}


