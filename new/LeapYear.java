import java.util.Scanner;

public class LeapYear{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);
System.out.println("Enter year");
int number = scan.nextInt();

if(number % 4 == 0){
	System.out.println(number+" is a leap year");
}
else{
	System.out.println(number+" is not a leap");
}
}}