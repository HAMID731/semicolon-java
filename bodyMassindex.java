import java.util.Scanner;


public class bodyMassindex{

public static void main(String[]args){
Scanner weight = new Scanner(System.in);


System.out.println("ENTER WEIGHT IN KILOGRAM");
double num1 = weight.nextDouble();

System.out.println("ENTER HEIGHT IN METERS");
double num2 = weight.nextDouble();

double sum = num1/(num2*num2);

System.out.println("the BMI(Body Mass Index) is " + sum);
}
}
