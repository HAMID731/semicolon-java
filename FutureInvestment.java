import java.util.Scanner;

public class FutureInvestment{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("ENTER YOUR INVESTMENT AMOUNT: ");
double investmentAmount = scan.nextDouble();

System.out.println("ENTER YOUR ANNUAL INTEREST RATE: ");
double annualRate = scan.nextDouble();


System.out.println("ENTER NUMBER OF years: ");
double numberOfyears = scan.nextDouble();

double sum =  investmentAmount*Math.pow((1+annualRate), (numberOfyears*12));

System.out.println("Accumulated values is $"+sum);
}}
