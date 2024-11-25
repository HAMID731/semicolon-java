public class ListConcatenation {
	public static int[] concatenateLists(int[] list1, int[] list2) {
		int[] result = new int[list1.length + list2.length];
		int i = 0, j = 0;

		while (i < list1.length) {
			result[i] = list1[i];
			i++;
		}

		while (j < list2.length) {
			result[i] = list2[j];
			i++;
			j++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] list1 = {1, 2, 3};
		int[] list2 = {4, 5, 6};
		int[] concatenated = concatenateLists(list1, list2);
		for (int num : concatenated) {
			System.out.print(num + " ");
		}
	}
}
