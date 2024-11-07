import java.util.Scanner;

	public class StageOne{
	
	public static void main(String[]args){	
	Scanner scan = new Scanner(System.in);
System.out.println("Enter grade");
int grade = scan.nextInt();

if(grade<50){
	System.out.println("D");
}else if(grade == 50 || grade < 60){
System.out.println("C");
}else if(grade == 60 || grade <= 80){
System.out.println("B");
}else if(grade> 80 || grade <= 100){
System.out.println("A");
} 
}
}