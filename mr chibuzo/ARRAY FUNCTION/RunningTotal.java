public class RunningTotal {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		computeRunningTotal(numbers);
	}

	public static void computeRunningTotal(int[] numbers) {
		int total = 0;
		for (int num : numbers) {
		total += num;
		System.out.println(total);
	}
}
}
