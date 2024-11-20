public class FindNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int element = 20;
        boolean exists = false;
        for (int num : arr) {
            if (num == element) {
                exists = true;
                break;
}
}
    System.out.println(exists);
}
}
