public class TabularOutput {
public static void main(String[] args) {
        System.out.print("N   N2   N3   N4\n");
        
        for (int i = 1; i <= 4; i++) {
            int n2 = i * i;
            int n3 = n2 * i;
            int n4 = n3 * i;
            System.out.print(i + "   " + n2 + "   " + n3 + "   " + n4 + "\n");
        }
    }
}
