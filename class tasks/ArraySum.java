public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum=0;
        int i=0;

        while(i<numbers.length) {
            sum+=numbers[i];
            i++;
        }
        System.out.println("The sum of the array values is: "+sum);
    }
}

