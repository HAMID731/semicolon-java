public class Largest{
	public static void main(String[]args){
	
		int[] numbers = {10, 20, 5, 8, 30};
		int largest = findLargest(numbers);
		System.out.println(largest);
	
	}
	
	public static int findLargest(int[] numbers) {
		int max = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
}
