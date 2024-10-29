import java.util.Scanner;

public class EqualityLoop{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

char repeat;


do{
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
System.out.println("Do you which to continue(yes/no)");
repeat = input.next().charAt(0);

}
while(repeat=='y' || repeat=='Y');
}}