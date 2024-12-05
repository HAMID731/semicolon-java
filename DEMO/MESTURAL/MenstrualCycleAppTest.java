import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualCycleAppTest {

    @Test
    public void testCalculateNextPeriodStart() {
        int lastPeriodDate = 1;
        int cycleLength = 28;
        int expectedNextPeriodStart = 29;
        int actualNextPeriodStart = MenstrualCycleApp.calculateNextPeriodStart(lastPeriodDate, cycleLength);
        assertEquals(expectedNextPeriodStart, actualNextPeriodStart);
    }

    @Test
    public void testCalculateOvulationDay() {
        int lastPeriodDate = 1;
        int cycleLength = 28;
        int expectedOvulationDay = 15;
        int actualOvulationDay = MenstrualCycleApp.calculateOvulationDay(lastPeriodDate, cycleLength);
        assertEquals(expectedOvulationDay, actualOvulationDay);
    }

    @Test
    public void testCalculateFertileStart() {
        int lastPeriodDate = 1;
        int cycleLength = 28;
        int expectedFertileStart = 10;
        int actualFertileStart = MenstrualCycleApp.calculateFertileStart(lastPeriodDate, cycleLength);
        assertEquals(expectedFertileStart, actualFertileStart);
    }

    @Test
    public void testCalculateFertileEnd() {
        int lastPeriodDate = 1;
        int cycleLength = 28;
        int expectedFertileEnd = 16;
        int actualFertileEnd = MenstrualCycleApp.calculateFertileEnd(lastPeriodDate, cycleLength);
        assertEquals(expectedFertileEnd, actualFertileEnd);
    }
}

