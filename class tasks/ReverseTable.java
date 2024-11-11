public class ReverseTables {
public static void main(String[] args) {
  for (int i = 1; i <= 9; i++) {
    for (int n = 9; n >= 1; n--) {
       System.out.printf("%2d x %2d = %2d ", n, i, (n * i));
}
System.out.println();
}
}
}
