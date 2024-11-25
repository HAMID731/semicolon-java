public class Kata{

	public static void main(String[]args){
		int input = 3;
		boolean result1 = getEven(input);
		System.out.println(result1);

		int number = 29;
		boolean isPrime = getPrimeNumber(number);
		System.out.println(isPrime);

		int input1 = 3;
		int input2 = 7;
		int result2 = getSubtraction(input1, input2);
		System.out.println(result2);

		int input3 = 5;
		int input4 = 4;
		float result3 = getQuotient(input3, input4);
		System.out.println(result3);

		int num1 = 10;
		int factorCount = countFactors(num1);
		System.out.println(factorCount);

		int num2 = 25;
		boolean result4 = getSquare(num2);
		System.out.println(result4);

		int number2 = 12321;
		boolean result5 = getPalindrome(number2);
		System.out.println(result5);

		int number3 = 5;
		int factoria = calculateFactorial(number3);
		System.out.println(factoria);

		int num4 = 10;
		int result6 = Square(num4);
		System.out.print(result6);
	}
	public static boolean getEven(int number){
	
		if (number % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean getPrimeNumber(int number) {
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
	
	public static int getSubtraction(int number1,int number2){
		int sum = 0;
		if (number2 > number1){

			sum = number2 - number1;
		}
		else{
			sum = number1 - number2;
		}
	return sum;
	}
	
	public static float getQuotient(int num1, int num2){
		if (num2 == 0){
			return 0;
		}

		int sum = 0;
		sum = num1 / num2;
	
		return sum;

	}
	
	public static int countFactors(int number) {
        	int count = 0;
        	for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
                	count++;
			}
		}
		return count;
	}

	public static boolean getSquare(int number){
		if (number < 0) {
			return false;
		}

		int sqrt = (int) Math.sqrt(number);
		
		if (sqrt * sqrt == number) {
			return true;
		}else{
			return false;
		}
	}

	public static boolean getPalindrome(int number){
		int num1 = number % 10;
		int num2 = number / 1000;
		int num3 = num2 / 10;
		int num4 = num2 % 10;
		int num5 = number % 100;
		int num6 = num5 / 10;

		if (num1 == num3 && num4 == num6) {
			return true;
		} else {
			return false;
        	}
	}

	public static int calculateFactorial(int number) {

		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static int Square(int number){

	int sum = number * number;
	return sum;
	}

}