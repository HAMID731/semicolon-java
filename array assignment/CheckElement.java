import java.util.Scanner;

public class CheckElement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    int n = scanner.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int element = scanner.nextInt();
    boolean found = false;

    int i = 0;
    do {
      if (arr[i] == element) {
        found = true;
        break;
      }
      i++;
    } while (i < n);

    System.out.println(found);
  }
}
