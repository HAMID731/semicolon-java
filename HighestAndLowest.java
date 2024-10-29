import java.util.Scanner;

public class HighestAndLowest {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double highest = Double.NEGATIVE_INFINITY;
double lowest = Double.POSITIVE_INFINITY;

while (true) {
System.out.println("Enter a number (or 'exit' to stop):");
String input = scanner.next();

if (input.equalsIgnoreCase("exit")) {
break;
}

double number = scanner.nextDouble();        

if (number > highest) {
highest = number;
}
if (number < lowest) {
lowest = number;
}
}

System.out.println("Highest number: " + highest);
System.out.println("Lowest number: " + lowest);
}
}

