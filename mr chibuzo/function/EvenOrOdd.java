public class EvenOrOdd{

	public static void main(String[]args){
		int input = 3;
		boolean result1 = isEven(input);
		System.out.println(result1);
		

		int number = 29;
		boolean isPrime = isPrimeNumber(number);
		System.out.println(isPrime);


		int input1 = 3;	
		int input2 = 7;
		int result2 = isSubtraction(input1,input2);
		System.out.println(result2);


		int input3 = 5;
		int input4 = 4;
		float result3 = isQuotient(input3,input4);
		System.out.print(result3);


	}
	public static boolean isEven(int number){
	
		if (number % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
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
	
	public static float isQuotient(int num1, int num2){
	if (num2 == 0){
		return 0;
	}

	int sum = 0;
	sum = num1 / num2;
	
	return sum;

	}



}