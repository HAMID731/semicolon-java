import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndexTest {
    @Test
    public void testFindIndex() {
        FindIndex finder = new FindIndex();
        int[] numbers = {12, 13, 54, 76, 23};

        assertEquals(1, finder.findIndex(numbers, 1));  // Test for element 13
        assertEquals(-1, finder.findIndex(numbers, 99)); // Test for element not in array
        assertEquals(4, finder.findIndex(numbers, 23));  // Test for last element
    }
}
