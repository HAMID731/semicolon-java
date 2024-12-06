import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class SemicolonStoreTest {

    @Test
    public void testCalculateTotals() {
        ArrayList<String> goods = new ArrayList<>();
        goods.add("Milk");
        goods.add("Bread");

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(50.0);
        prices.add(30.0);

        ArrayList<Integer> quantities = new ArrayList<>();
        quantities.add(2);
        quantities.add(3);

        double finalTotal = SemicolonStore.calculateTotals(goods, prices, quantities);

        double expectedSubtotal = 190.0;
        double expectedDiscount = 19.0;
        double expectedVAT = 12.825;
        double expectedFinalTotal = 183.825;

        assertEquals(expectedFinalTotal, finalTotal, 0.001, "Final total should match expected value.");
    }
}
