import java.util.Scanner;

public class TaskFour{

public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter age: ");
	int Age = scan.nextInt();
	
	if(Age >= 18){
		System.out.println("You Are Eligible To Vote");
	}else{
		System.out.println("You Are Not Eligible To Vote");
	}if(Age >= 16){
		System.out.println("You can drive");
	}else{
		System.out.println("bobo you can't drive");
	}if(Age >= 21){
		System.out.println("You can drink");
	}else{
		System.out.println("you can't drink");
	}
}
}
	