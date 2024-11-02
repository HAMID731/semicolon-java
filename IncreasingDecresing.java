import java.util.Scanner;

public class IncreasingDecresing{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter Number:");
int numOne = scan.nextInt();
System.out.println("Enter Number:");
int numTwo = scan.nextInt();
System.out.println("Enter Number:");
int numThree = scan.nextInt();

if (numOne>numTwo && numTwo>numThree){
	System.out.println("They are in increasing other");
}
else if (numThree>numTwo && numThree>numOne){
	System.out.println("They are in decreasing  other");
}
else {
	System.out.println("They are not in order");
}
}}