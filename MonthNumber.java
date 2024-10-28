import java.util.Scanner;

public class MonthNumber{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);


System.out.println("input a month number: ");
int number1 = scan.nextInt();
System.out.println("input a year: ");
int number2 = scan.nextInt();



if (number1==1){
	System.out.println("JANUARY 2016 HAS 31 days");
}	
else if(number1==2 && number1 % 4 ==0){
	System.out.println("FEBRUARY 2016 HAS 29 days");
}
else{
	System.out.println("FEBRUARY 2020 HAS 30 days");
}
 if (number1==3){
	System.out.println("March 2016 HAS 31 days");
}	
else if(number1==4){
	System.out.println("APRIL 2016 HAS 30 days");
}
else if (number1==5){
	System.out.println("MAY 2016 HAS 31 days");
}	
else if(number1==6){
	System.out.println("JUNE 2016 HAS 30 days");
}
else if (number1==7){
	System.out.println("JULY 2016 HAS 31 days");
}	
else if(number1==8){
	System.out.println("AUGUST 2016 HAS 31 days");
}
else if (number1==9){
	System.out.println("SEPTEMPER 2016 HAS 30 days");
}	
else if(number1==10){
	System.out.println("OCTOBER 2016 HAS 31 days");
}
else if (number1==11){
	System.out.println("NOVEMBER 2016 HAS 30 days");
}	
else if(number1==12){
	System.out.println("DECEMBER 2016 HAS 31 days");
}
else if(number1 % 4 !=0){
	System.out.println("february 2016 HAS 30 days");
}
}}