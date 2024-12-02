import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PizzaWahalaTest {

    @Test
    public void testGetSlicesPerBox() {
        assertEquals(4, PizzaWahala.getSlicesPerBox("sapa"));
        assertEquals(6, PizzaWahala.getSlicesPerBox("smallmoney"));
        assertEquals(8, PizzaWahala.getSlicesPerBox("bigboys"));
        assertEquals(12, PizzaWahala.getSlicesPerBox("odogwu"));
        assertEquals(0, PizzaWahala.getSlicesPerBox("unknown"));
    }

    @Test
    public void testGetPricePerBox() {
        assertEquals(1500, PizzaWahala.getPricePerBox("sapa"));
        assertEquals(2500, PizzaWahala.getPricePerBox("smallmoney"));
        assertEquals(3500, PizzaWahala.getPricePerBox("bigboys"));
        assertEquals(5200, PizzaWahala.getPricePerBox("odogwu"));
        assertEquals(0, PizzaWahala.getPricePerBox("unknown"));
    }

    @Test
    public void testCalculateBoxesNeeded() {
        assertEquals(1, PizzaWahala.calculateBoxesNeeded(4, 4));
        assertEquals(2, PizzaWahala.calculateBoxesNeeded(7, 4));
        assertEquals(3, PizzaWahala.calculateBoxesNeeded(11, 4));
    }

    @Test
    public void testCalculateLeftoverSlices() {
        assertEquals(0, PizzaWahala.calculateLeftoverSlices(4, 4, 1));
        assertEquals(1, PizzaWahala.calculateLeftoverSlices(7, 4, 2));
        assertEquals(5, PizzaWahala.calculateLeftoverSlices(11, 4, 3));
    }

    @Test
    public void testCalculateTotalCost() {
        assertEquals(1500, PizzaWahala.calculateTotalCost(1, 1500));
        assertEquals(5000, PizzaWahala.calculateTotalCost(2, 2500));
        assertEquals(10500, PizzaWahala.calculateTotalCost(3, 3500));
    }
}
