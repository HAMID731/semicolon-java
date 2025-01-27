package T;
import code.AirConditioner;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AirConditionerTest {

    @Test
    public void testOnAirConditioner() {
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.turnOn());
    }
    @Test
    public void testOffAirConditioner() {
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.turnOff());

    }
    @Test
    public void testIncreaseAirConditioner() {
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.increaseTemperature());
    }
    @Test
    public void testDecreaseAirConditioner() {
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.decreaseTemperature());
    }
    @Test
    public void maxTemperature() {
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.maxTemperatureLimit());
    }
    public void minTemperature() {
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.minTemperatureLimit());
    }
}
