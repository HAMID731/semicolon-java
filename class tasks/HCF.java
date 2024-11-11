import java.util.Scanner;

public class HCF{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);

System.out.print("Enter number");
int a =scan.nextInt();
System.out.print("Enter number");
int b =scan.nextInt();

 while (b != 0) {
  int temp = b;
   b = a % b;
   a = temp;
        }
        System.out.println(a);
    }
}
