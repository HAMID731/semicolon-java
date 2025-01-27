package code;

public class AirConditioner {

    private final boolean isOn;
    private final boolean isOff;
    private int temperature;
    private final int max_temperature = 30;
    private final int min_temperature = 18;

    public AirConditioner() {
        isOn = false;
        isOff = true;
        temperature = 25;
    }

    public boolean turnOn() {
        return isOn;
    }

    public boolean turnOff() {
        return isOff;
    }

    public boolean increaseTemperature() {
        temperature = temperature + 1;
        return true;
    }
    public boolean decreaseTemperature() {
        temperature = temperature - 1;
        return true;
    }

    public boolean maxTemperatureLimit() {
        return temperature <= max_temperature;
    }
    public boolean minTemperatureLimit() {
        return temperature >= min_temperature;
    }

}
