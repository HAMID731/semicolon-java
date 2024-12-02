import java.util.Scanner;

public class MenstrualCycleApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int lastPeriodDate = 1;

		System.out.print("Enter the average cycle length: ");
		int cycleLength = scanner.nextInt();

		int nextPeriodStart = calculateNextPeriodStart(lastPeriodDate, cycleLength);
		int ovulationDay = calculateOvulationDay(lastPeriodDate, cycleLength);
		int fertileStart = calculateFertileStart(lastPeriodDate, cycleLength);
		int fertileEnd = calculateFertileEnd(lastPeriodDate, cycleLength);

		System.out.println("Predicted next period start date: Day " + nextPeriodStart);
		System.out.println("Ovulation date: Day " + ovulationDay);
		System.out.println("Fertile window: Day " + fertileStart + " to Day " + fertileEnd);

	}

	public static int calculateNextPeriodStart(int lastPeriodDate, int cycleLength) {
		return lastPeriodDate + cycleLength;
	}

	public static int calculateOvulationDay(int lastPeriodDate, int cycleLength) {
		return lastPeriodDate + cycleLength - 14;
	}

	public static int calculateFertileStart(int lastPeriodDate, int cycleLength) {
		int ovulationDay = lastPeriodDate + cycleLength - 14;
		return ovulationDay-5;
	}

	public static int calculateFertileEnd(int lastPeriodDate, int cycleLength) {
		int ovulationDay = lastPeriodDate + cycleLength - 14;
		return ovulationDay+1;
	}
}
