import java.util.Scanner;

public class ThreeIntegers{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("ENTER THE FIRST NUMBER: ");
int firstNUmber = scan.nextInt();

System.out.println("ENTER THE SECOND NUMBER: ");
int secondNumber = scan.nextInt();


System.out.println("ENTER THE THIRD NUMBER: ");
int thirdNumber = scan.nextInt();

if (firstNUmber<0 || secondNumber<0 || thirdNumber<0 ){
	System.out.println("false");
}
else{
	System.out.println("true");
}
}}
