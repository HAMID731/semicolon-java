public class PalindromeTest {
	public static void main(String[] args) {
		String input = "madam";
		boolean result = isPalindrome(input);
		System.out.println(result);
	}

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
			return false;
			}
			left++;
			right--;
		}
		return true;
}
}
