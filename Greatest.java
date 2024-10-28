import java.util.Scanner;

public class Greatest{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("input number: ");
int number1 = scan.nextInt();

System.out.println("input number: ");
int number2 = scan.nextInt();

System.out.println("input number: ");
int number3 = scan.nextInt();

if (number1>number2 && number1>number3){
	System.out.println(number1+" is the greatest");
}
if (number2>number1 && number2>number2){
	System.out.println(number2+" is the greatest");
}
if (number3>number1 && number3>number2){
	System.out.println(number3+" is the greatest");
}
}}