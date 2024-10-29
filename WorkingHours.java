import java.util.Scanner;

public class WorkingHours{

public static void main(String[]args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter working hours");
int number = scan.nextInt();

if(number>=2 || number<=3){
 System.out.println("The worker is highly efficient");
}else if(number>3 || number<=4){
 System.out.println("The worker is said to improve speed");
}else if(number>4 || number<=5){
 System.out.println("The worker is given training to improve his speed");
}else{
 System.out.println("The would have to leave our working environment");
}
}}