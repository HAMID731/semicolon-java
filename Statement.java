import java.util.Scanner;

public class Statement{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("ENTER NUMBER");
double firstNumber = scan.nextDouble();

System.out.println("ENTER NUMBER");
double secondNumber = scan.nextDouble();

System.out.println("ENTER NUMBER");
double thirdNumber = scan.nextDouble();

if (firstNumber>secondNumber && firstNumber>thirdNumber){
	System.out.println(firstNumber);
}
else if (secondNumber>firstNumber && secondNumber>thirdNumber){
	System.out.println(secondNumber);
}
if (thirdNumber>firstNumber && thirdNumber>secondNumber){
	System.out.println(thirdNumber);

}
}}