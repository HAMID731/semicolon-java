import java.util.Scanner;

public class Times {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int[] count = new int[51];

System.out.print("Enter the integers between 1 and 50: ");
int num;

while ((num = input.nextInt()) != 0) {
if (num >= 1 && num <= 50) {
count[num]++;
}
}

for (int i = 1; i <= 50; i++) {
if (count[i] > 0) {
if (count[i] == 1) {
System.out.println(i + " occurs 1 time");
} else {
System.out.println(i + " occurs " + count[i] + " times");
}
}
}
}
}
