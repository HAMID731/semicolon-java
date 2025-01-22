import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        int[] numbers = {12, 13, 54, 76, 23};
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == input) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}
