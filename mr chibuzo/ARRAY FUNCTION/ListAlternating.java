public class ListAlternating {
	public static int[] alternateCombine(int[] list1, int[] list2) {
		int[] result = new int[list1.length + list2.length];
		int i = 0, j = 0, k = 0;

		while (i < list1.length || j < list2.length) {
			if (i < list1.length) {
				result[k++] = list1[i++];
			}
			if (j < list2.length) {
				result[k++] = list2[j++];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] list1 = {1, 2, 3};
		int[] list2 = {4, 5, 6, 7};
		int[] combined = alternateCombine(list1, list2);
		for (int num : combined) {
			System.out.print(num + " ");
		}
	}
}
