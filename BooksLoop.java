import java.util.Scanner;

public class BooksLoop{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);
char input;
do{

System.out.println("Enter the amount of time taken ");

int number = scan.nextInt();

if(number<=5){
	System.out.println("The fine is 50 paise");
}
else if(number<=29){
	System.out.println("The fine is 1 rupee");
}
else if(number>=30){
	System.out.println("The fine is 5 rupee");
}
else{
	System.out.println("your membership has been cancelled");
}
System.out.println("would u like to continue(yes or no)");
input = scan.next().charAt(0);
}while(input == 'y' || input == 'Y');
}}