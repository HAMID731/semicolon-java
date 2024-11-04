import java.util.Scanner;

public class GasMileage {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milesDriven;
        int gallonsUsed;
        double totalMiles = 0;
        double totalGallons = 0;

        System.out.print("Enter miles driven (or -1 to exit): ");
        milesDriven = scanner.nextInt();
        
        while (milesDriven != -1) {
            System.out.print("Enter gallons used: ");
            gallonsUsed = scanner.nextInt();

            double mpg = (double) milesDriven / gallonsUsed;
            totalMiles += milesDriven;
            totalGallons += gallonsUsed;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);
            
            if (totalGallons > 0) {
                double overallMpg = totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon: %.2f%n", overallMpg);
            }

            System.out.print("Enter miles driven (or -1 to exit): ");
            milesDriven = scanner.nextInt();
        }
    }
}
