import java.util.ArrayList;
	public class PrimeNumber{
	public static void main(String[]args){
		get_prime_list(3);
	}

	public static void get_prime_list(int number){
		int[] myArray = new int[]{}; 
    		if (number <= 1) {
			System.out.print("invalid");
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
			System.out.print(myArray[i]);
			}
		}
		
	}
}
