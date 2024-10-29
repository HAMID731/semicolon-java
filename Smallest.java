import java.util.Scanner;

public class Smallest{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter number");
double smallest = Double.MIN_VALUE;
double highest = Double.MAX_VALUE;

while (true) {
System.out.print("Enter number (or 'exit' to stop): ");
int number = scan.nextInt();
String input = scan.next();

if (input.equalsIgnoreCase("exit")) {
break;
}

if (number>highest){
 number=highest;
}
else{
number=smallest;
}
if (highest > -Infinity) {
System.out.println("Highest number entered: " + highest);
}
else if (smallest < -Infinity) {
System.out.println("smallest number entered: " + smallest);
} else {
System.out.println("No numbers entered.");
}

}}}

