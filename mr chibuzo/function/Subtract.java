public class Subtract{
	public static void main(String[]args){
	int input1 = 3;	
	int input2 = 7;
	int result = isSubtraction(input1,input2);
	
	System.out.print(result);
	}

	public static int isSubtraction(int number1,int number2){
		int sum = 0;
		if (number2 > number1){

			sum = number2 - number1;
		}
		else{
			sum = number1 - number2;
		}
	return sum;
	}
}