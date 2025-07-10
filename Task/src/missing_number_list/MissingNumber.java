package missing_number_list;

import java.util.Arrays;

public class MissingNumber {
    int[] number;
    public static void main(String[] args) {
        int[] input = {1, 2, 5};
        int[] output = findMissingNumbers(input);
        System.out.println(Arrays.toString(output));
    }

    public static int[] findMissingNumbers(int[] input) {
        int min = input[0];
        int max = input[input.length - 1];
        int[] allNumbers = new int[max - min + 1];
        int missingCount = 0;

        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int num : input) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                allNumbers[missingCount++] = i;
            }
        }

        return Arrays.copyOf(allNumbers, missingCount);
    }
}
