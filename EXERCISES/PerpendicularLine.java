import java.util.Scanner;

public class PerpendicularLine {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
System.out.print("Enter the x coordinate of the first point: ");
int x1 = scanner.nextInt();
System.out.print("Enter the y coordinate of the first point: ");
int y1 = scanner.nextInt();
System.out.print("Enter the x coordinate of the second point: ");
int x2 = scanner.nextInt();
System.out.print("Enter the y coordinate of the second point: ");
int y2 = scanner.nextInt();
        
if (x1 == x2) {
System.out.println("The points are located on a vertical line (perpendicular to the x-axis).");
} else if (y1 == y2) {
System.out.println("The points are located on a horizontal line (perpendicular to the y-axis).");
} else {
System.out.println("The points are not located on a line perpendicular to an axis.");
}
}
}
