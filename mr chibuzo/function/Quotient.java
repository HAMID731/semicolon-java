public class Quotient{
	public static void main(String[]args){
	int input1 = 5;
	int input2 = 4;
	float result = isQuotient(input1,input2);
	System.out.print(result);
	}

	public static float isQuotient(int num1, int num2){
	if (num2 == 0){
		return 0;
	}

	int sum = 0;
	sum = num1 / num2;
	
	return sum;

	}
}