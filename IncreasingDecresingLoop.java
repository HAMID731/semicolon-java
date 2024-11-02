import java.util.Scanner;

public class IncreasingDecresingLoop{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);
char input;
do{
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
System.out.println("would u like to continue(yes or no)");
input = scan.next().charAt(0);
}while(input == 'y' || input == 'Y');
}}