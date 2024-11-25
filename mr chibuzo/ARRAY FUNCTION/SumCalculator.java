public class SumCalculator {
    public static int sumWithForLoop(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static int sumWithWhileLoop(int[] numbers) {
        int total = 0;
        int index = 0;
        while (index < numbers.length) {

            total += numbers[index];
            index++;
        }
        return total;
    }

    public static int sumWithDoWhileLoop(int[] numbers) {
        int total = 0;
        int index = 0;
        if (numbers.length > 0) {
            do {
                total += numbers[index];
                index++;
            } while (index < numbers.length);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumWithForLoop(numbers));
        System.out.println(sumWithWhileLoop(numbers));
        System.out.println(sumWithDoWhileLoop(numbers));
    }
}
