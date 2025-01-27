package test;
import org.junit.jupiter.api.Test;
import src.CompoundInterestCalculator;

import static org.junit.jupiter.api.Assertions.*;

class CompoundInterestCalculatorTest {

    @Test
    void testCalculateCompoundInterest() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator(5000, 5, 3, 4);
        double expectedInterest = 781.518695;
        double actualInterest = calculator.calculateCompoundInterest();
        assertEquals(expectedInterest, actualInterest, 0.0001);
    }

    @Test
    void testCalculateTotalAmount() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator(5000, 5, 3, 4);
        double expectedTotalAmount = 5781.518695;
        double actualTotalAmount = calculator.calculateTotalAmount();
        assertEquals(expectedTotalAmount, actualTotalAmount, 0.0001);
    }

    @Test
    void testPrincipal() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator(5000, 5, 3, 4);
        assertEquals(5000, calculator.getPrincipal());
    }

    @Test
    void testRate() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator(5000, 5, 3, 4);
        assertEquals(5, calculator.getRate());
    }

    @Test
    void testTime() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator(5000, 5, 3, 4);
        assertEquals(3, calculator.getTime());
    }

    @Test
    void testFrequency() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator(5000, 5, 3, 4);
        assertEquals(4, calculator.getFrequency());
    }
}
