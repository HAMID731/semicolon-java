import java.util.Scanner;
public class Sum_one{

public static void main(String[]args){

 Scanner scan= new Scanner(System.in);
System.out.print("ENTER NUMBER");
int num1 = scan.nextInt();
System.out.print("ENTER NUMBER");
float num2 = scan.nextFloat();
System.out.print("ENTER NUMBER");
double num3 = scan.nextDouble();
double sum = num1+num2+num3;

System.out.print("the sum of the numbers: "+sum);

}}