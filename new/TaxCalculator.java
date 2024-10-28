import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

double tax_low = 0.15;
double tax_HIGH = 0.20;
double income_ceiling = 30000;

System.out.print("Enter number of citizens: ");
int num_Citizens = scanner.nextInt();

while (true) {
System.out.print("Enter citizen's name (or 'exit' to stop): ");
String name = scanner.next();

if (name.equalsIgnoreCase("exit")) {
break;
}

System.out.print("Enter citizen's earnings: ");
double earnings = scanner.nextDouble();

double tax;
if (earnings <= income_ceiling) {
tax = earnings * tax_low;
} else {
tax = income_ceiling * tax_low + (earnings - income_ceiling) * tax_HIGH;
}

 System.out.println(name + "'s total tax: $" + String.format("%.2f", tax));
            System.out.println();
        }
    }
}


