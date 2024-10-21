import java.util.Scanner;

public class assign{

public static void main(String[]args){

Scanner modulus= new Scanner(System.in);

System.out.println("ENTER INTEGER : ");
int num1= modulus.nextInt();
int cal1= num1 % 10;
int cal2= num1 / 10;
int rough= cal2 % 10;
int cal3= num1 / 100;

int calculator= cal1 + rough +cal3;

System.out.println(calculator);
}
}