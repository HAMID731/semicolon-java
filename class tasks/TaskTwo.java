import java.util.Scanner;

public class TaskTwo{
	
	public static void main(String[]args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter temparature");
		int temperature = input.nextInt();

		if(temperature <= 9){
			System.out.println("cold !!!");
		}else if(temperature >= 10 && temperature <= 24){
			System.out.println("warm");
		}else if(temperature >= 25){
			System.out.println("hot !!!");
		}
}}