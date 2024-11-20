import java.util.Scanner;

public class QuestionTwo{
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);

	System.out.print("AGES : \n1.(1-10) \n2.(11-20)\n3.(21-50)\n4.here enter your specific age e.g (50 and ABOVE)\n>>>>>>");
	int number = 0 ;
	
	do{

	number++;

	int answer = scan.nextInt();
	switch(answer){
	
		case 1 :
			System.out.print("CHILD\n");
			break;
		case 2 :
			System.out.print("TEENAGER\n");
			break;
		case 3 :
			System.out.print("MATURED\n");
			break;
		default :
			System.out.print(answer+"\n");
	}
	}while(number <= 20);

}}	