public class Reverse{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = reverseArray(arr);

        System.out.print(reversed);
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverseArray(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        return reversed;
    }
}
