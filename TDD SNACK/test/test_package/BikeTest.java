package test_package;

import code.Bike;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BikeTest {

    @Test
    public void testBikeCanBeTurnedOn() {
        Bike bike = new Bike();
        bike.turnOn();
        Assert.assertTrue(bike.isOn());
    }

    @Test
    public void testBikeCanBeTurnedOff() {
        Bike bike = new Bike();
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());
    }
    @Test
    public void testBikeAcceleration(){
        Bike bike = new Bike();

    }
}

