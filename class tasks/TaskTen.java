import java.util.Scanner;

public class TaskSeven{

	public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	float pie = 3.147f;
	
	System.out.print("Enter department\n1. circle\n2. rectangle\n3. triangle\n Enter Number>>>>>>");

	int answer = scanner.nextInt();

	switch(answer){

	case 1:
			System.out.println("circle");
			float radius = scanner.nextFloat();
			float sum1 = pie * (radius*radius);
			System.out.println("the area of a circle is "+ sum1);
			break;

	case 2:
			System.out.println("rectangle");
			System.out.println("enter length");
			float length = scanner.nextFloat();
			System.out.println("enter width");
			float width = scanner.nextFloat();
			float sum2 = length * width;
			System.out.print("the area of the rectangle is "+sum2);
			break;
			
	case 3:
			System.out.println("triangle");
			System.out.println("enter base");
			float base = scanner.nextFloat();
			System.out.println("enter height");
			float height = scanner.nextFloat();
			double sum3 = 0.5 * (base* height);
			System.out.print("the area of the triangle is "+sum3);
			break;

		
	}
}}