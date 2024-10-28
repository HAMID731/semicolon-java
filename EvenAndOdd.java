import java.util.Scanner;

public class EvenAndOdd{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("INPUT NUMBER: ");
int number = scan.nextInt();


if (number % 2 !=0){ 
	System.out.println("0");
}
else{
	System.out.println("1");
}
}}