public class PrimeCheck {
	public static void main(String[] args) {
		int number = 29;
		boolean isPrime = isPrimeNumber(number);
		System.out.println(isPrime);
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
}
