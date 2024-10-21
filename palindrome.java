import java.util.Scanner;

public class palindrome{

public static void main(String[]args){

Scanner numbers= new Scanner(System.in);

System.out.print("ENTER THE INTEGER ");
int num1= numbers.nextInt();
int cal1= num1 % 10;
int cal2= num1 / 10;
int rough= cal2 % 10;
int cal3= num1 / 100;

if(cal1==cal3){
 System.out.println(num1+" is a palindrom");
}
else{
 System.out.println(num1+" is not a palindrom");
}
}
}