import java.util.Scanner;

public class LeapYear{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

int counter=0;
while(counter <= 4){
System.out.println("Enter year");
int number = scan.nextInt();

if(number % 4 == 0){
	System.out.println(number+" is a leap year");
}
else{
	System.out.println(number+" is not a leap");
}
counter++;
}

}}