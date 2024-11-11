import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2}; // example array

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }
}
