import java.util.Scanner;

public class Equality{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter number");
int num1 = input.nextInt();
System.out.println("Enter number");
int num2 = input.nextInt();
System.out.println("Enter number");
int num3 = input.nextInt();

if (num1==num2 && num1==num3 && num2==num3){
		System.out.println("They are equal");
}
else{
		System.out.println("They are not equal");
}
}}