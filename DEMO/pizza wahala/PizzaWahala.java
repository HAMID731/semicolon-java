import java.util.Scanner;

public class PizzaWahala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of guests: ");
        int numberOfGuests = scanner.nextInt();

        System.out.print("Enter the pizza type (sapa, smallmoney, bigboys, odogwu): ");
        String pizzaType = scanner.next();

        int slicesPerBox = getSlicesPerBox(pizzaType);
        int pricePerBox = getPricePerBox(pizzaType);

        if (slicesPerBox == 0 || pricePerBox == 0) {
            System.out.println("Invalid pizza type.");
            
        }

        int boxesNeeded = calculateBoxesNeeded(numberOfGuests, slicesPerBox);
        int leftoverSlices = calculateLeftoverSlices(numberOfGuests, slicesPerBox, boxesNeeded);
        int totalCost = calculateTotalCost(boxesNeeded, pricePerBox);

        System.out.println("Number of boxes of pizza to buy = " + boxesNeeded + " boxes");
        System.out.println("Number left over slices after serving = " + leftoverSlices + " slices");
        System.out.println("Price = " + totalCost);
    }

    public static int getSlicesPerBox(String pizzaType) {
        switch (pizzaType.toLowerCase()) {
            case "sapa": return 4;
            case "smallmoney": return 6;
            case "bigboys": return 8;
            case "odogwu": return 12;
            default: return 0;
        }
    }

    public static int getPricePerBox(String pizzaType) {
        switch (pizzaType.toLowerCase()) {
            case "sapa": return 1500;
            case "smallmoney": return 2500;
            case "bigboys": return 3500;
            case "odogwu": return 5200;
            default: return 0;
        }
    }

    public static int calculateBoxesNeeded(int guests, int slicesPerBox) {
        return (guests + slicesPerBox - 1) / slicesPerBox;
    }

    public static int calculateLeftoverSlices(int guests, int slicesPerBox, int boxes) {
        return (boxes * slicesPerBox) - guests;
    }

    public static int calculateTotalCost(int boxes, int pricePerBox) {
        return boxes * pricePerBox;
    }
}
