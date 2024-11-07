import java.util.Scanner;

public class StageFour{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);
System.out.println("Enter grade:\n1. 100\n2. 70\n3. 50");

int number =scan.nextInt();

switch(number){
case 1:
System.out.println("A");
break;
case 2:
System.out.println("B");
break;
case 3:
System.out.println("C");
break;
default:
System.out.println("welldone");
break;
}
}
}

