import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MultipleTest {
    private Multiples multiples;
    @BeforeEach
    void setUp() {
        multiples = new Multiples();
    }

    @Test
    public void addsMultiplesToTheList() {
        List<Integer> holder = new ArrayList<>();
        holder.add(2);
        holder.add(4);
        holder.add(6);
        holder.add(8);
        holder.add(10);
        assertEquals(multiples.putInList(1,10,2),holder);
    }

    @Test
    public void itThrowsErrorWhenSecondNumberIsLessTheFirstNumber() {
        assertThrows(IllegalArgumentException.class,() -> multiples.putInList(10,1,2));
    }

}
