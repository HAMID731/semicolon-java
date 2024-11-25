public class OddPositionElements {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 60};
		printOddPositionElements(elements);
	}

	public static void printOddPositionElements(int[] elements) {
		for (int i = 0; i < elements.length; i += 2) {
		System.out.println(elements[i]);
	}
	}
}
