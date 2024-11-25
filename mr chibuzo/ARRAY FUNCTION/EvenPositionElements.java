public class EvenPositionElements {
	public static void main(String[] args) {
		int[] elements = {10, 20, 30, 40, 50, 60};
		printEvenPositionElements(elements);
	}

	public static void printEvenPositionElements(int[] elements) {
		for (int i = 1; i < elements.length; i += 2) {
		System.out.println(elements[i]);
	}
}
}
