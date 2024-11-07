import java.util.Scanner;

	public class StageTwo{
	
	public static void main(String[]args){	
	Scanner scan = new Scanner(System.in);
int grade ;
int counter = 0;

while(counter<=4){
System.out.println("Enter grade");
grade = scan.nextInt();
if(grade<50){
	System.out.println("D");
}else if(grade == 50 || grade < 60){
System.out.println("C");
}else if(grade == 60 || grade <= 80){
System.out.println("B");
}else if(grade> 80 || grade <= 100){
System.out.println("A");
}
counter++;
}
}
}