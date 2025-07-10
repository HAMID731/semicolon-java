import java.util.Arrays;

public class SumOfMissingNumbers {

    public static int sumOfMissing(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];
        int sumOfMissing = 0;

        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                sumOfMissing += i;
            }
        }

        return sumOfMissing;
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 5, 7, 9};
        System.out.println("Sum of missing numbers in " + Arrays.toString(numbers1) + ": " + sumOfMissing(numbers1)); // Output: 2 + 4 + 6 + 8 = 20

        int[] numbers2 = {10, 11, 13, 16};
        System.out.println("Sum of missing numbers in " + Arrays.toString(numbers2) + ": " + sumOfMissing(numbers2)); // Output: 12 + 14 + 15 = 41

        int[] numbers3 = {1, 2, 3};
        System.out.println("Sum of missing numbers in " + Arrays.toString(numbers3) + ": " + sumOfMissing(numbers3)); // Output: 0

        int[] numbers4 = {5, 2, 8};
        System.out.println("Sum of missing numbers in " + Arrays.toString(numbers4) + ": " + sumOfMissing(numbers4)); // Output: 3 + 4 + 6 + 7 = 20

        int[] emptyArray = {};
        System.out.println("Sum of missing numbers in " + Arrays.toString(emptyArray) + ": " + sumOfMissing(emptyArray)); // Output: 0

        int[] singleElementArray = {5};
        System.out.println("Sum of missing numbers in " + Arrays.toString(singleElementArray) + ": " + sumOfMissing(singleElementArray)); // Output: 0
    }
}