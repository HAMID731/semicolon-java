import java.util.ArrayList;
import java.util.Scanner;

public class SemicolonStore {

    public static void main(String[] args) {
        ArrayList<String> goods = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        String continueInput;

        do {
            System.out.print("Enter name of goods: ");
            goods.add(scan.nextLine());

            System.out.print("Enter price of goods: ");
            prices.add(scan.nextDouble());

            System.out.print("Enter quantity of goods: ");
            quantities.add(scan.nextInt());
            scan.nextLine();

            System.out.print("Do you want to buy more (yes or no): ");
            continueInput = scan.nextLine().toLowerCase();
        } while (continueInput.equals("yes"));

        double finalTotal = calculateTotals(goods, prices, quantities);
        askForPayment(finalTotal, scan);
    }

    public static double calculateTotals(ArrayList<String> goods, ArrayList<Double> prices, ArrayList<Integer> quantities) {
        double subtotal = 0;

        for (int i = 0; i < goods.size(); i++) {
            subtotal += prices.get(i) * quantities.get(i);
        }

        double discount = (subtotal > 100) ? subtotal * 0.1 : 0;
        double vat = (subtotal - discount) * 0.075;
        double finalTotal = subtotal - discount + vat;

        System.out.println("\n--- Purchase---");
        System.out.println("Items Purchased:");
        for (int i = 0; i < goods.size(); i++) {
            System.out.println("Item " + (i ) + ": Goods = " + goods.get(i) +
                    " Price = " + prices.get(i) +
                    " Quantity = " + quantities.get(i) +
                    " Subtotal = " + (prices.get(i) * quantities.get(i)));
        }
        System.out.println("\nSubtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("VAT (7.5%): " + vat);
        System.out.println("Final Total: " + finalTotal);

        return finalTotal;
    }

    public static void askForPayment(double finalTotal, Scanner scan) {
        System.out.print("\nEnter the amount paid by the customer: ");
        double amountPaid = scan.nextDouble();

        if (amountPaid < finalTotal) {
            System.out.println("Insufficient payment. Please pay at least: " + finalTotal);
        }

        double change = amountPaid - finalTotal;
        System.out.println("Amount Paid: " + amountPaid);

        if(change == 0) {
            System.out.println("You have no change.");
        }
        else{
            System.out.println("change= "+ change);
        }
    }
}
