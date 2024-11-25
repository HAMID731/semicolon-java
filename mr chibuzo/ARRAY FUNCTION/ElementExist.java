public class ElementExist {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 8, 9};
		int target = 5;

		boolean result = isElementExist(numbers, target);
		System.out.println(result);
	}

	public static boolean isElementExist(int[] numbers, int target) {
		for (int num : numbers) {
			if (num == target) {
		return true;
			}
		}
		return false;
	}
}
