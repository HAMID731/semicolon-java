
public class MultiplicationTable {
public static void main(String[] args) {
int number = 10;

System.out.println("Multiplication Table of " + number);

int i = 1;
do {
int product = number * i;
System.out.println(number + " * " + i + " = " + product);
i++;
} while (i <= 9);
}
}
