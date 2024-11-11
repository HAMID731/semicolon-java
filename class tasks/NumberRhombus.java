import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // example array
        int sum = Arrays.stream(numbers).sum();
        
        System.out.println("The sum of the array values is: " + sum);
    }
}
