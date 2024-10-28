import java.util.Scanner;

public class PositiveNegative{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("input number: ");
int number1 = scan.nextInt();

if (number1<0){
	System.out.println("Number is Negative");
}
else if (number1>0){
	System.out.println("Number is Positive");
}
else{
	System.out.println("Number is Neutral");
}
	}

}
