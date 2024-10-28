import java.util.Scanner;

public class WeekDays{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);


System.out.println("input a day number: ");

int number1 = scan.nextInt();




if (number1==1){
	System.out.println("MONDAY");
}	
else if(number1==2 ){
	System.out.println("TUESDAY");
}
else if (number1==3){
	System.out.println("WEDNESDAY");
}
 if (number1==4){
	System.out.println("THURSDAY");
}	
else if(number1==5){
	System.out.println("FRIDAY");
}
else if (number1==6){
	System.out.println("SATURDAY");
}	
else if (number1==7){
	System.out.println("SUNDAY");
}	
}}
