import java.util.Scanner;

public class ZeroValues{

public static void main(String[]args){

Scanner Scanner = new Scanner(System.in);

char repeat;
int number;

do{
System.out.println("Enter number: ");
number=Scanner.nextInt();

if(number>0){
System.out.println(" number is a positive number");
}else if(number<0){
System.out.println(" number is a negative number");
}else{
System.out.println("number is a zero value ");
}
System.out.print("Do you want to repeat? (y/n): ");
repeat = Scanner.next().charAt(0);
}
 while (repeat == 'y' || repeat == 'Y');
}}