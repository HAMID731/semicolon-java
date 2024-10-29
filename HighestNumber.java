import java.util.Scanner;

public class HighestNumber{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

double highest = Double.NEGATIVE_INFINITY;
double smallest = Double.POSITIVE_INFINITY;
char input;

do {
System.out.print("Enter a number (or 'stop' to finish): ");
input = scan.next().At(0);

if (highest != Double.NEGATIVE_INFINITY && smallest != Double.POSITIVE_INFINITY) {
System.out.println("Highest number: " + highest);
System.out.println("Smallest number: " + smallest);
} else {
System.out.println("No numbers entered.");
}
}
while (input == 's');
}}
