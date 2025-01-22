package T;
import code.AirConditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
