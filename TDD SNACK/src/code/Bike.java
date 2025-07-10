package code;
import code.Enum;

public class Bike {
    private boolean isOn;
    private int speed;
    public String gearType;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        speed = 0;
    }

    public void accelerate() {
        if (isOn) {
            switch (gearType) {
                case "Gear 1":
                    speed = speed + 1;
                    break;
                case "Gear 2":
                    speed = speed + 2;
                    break;
                case "Gear 3":
                    speed = speed + 3;
                    break;
                case "Gear 4":
                    speed = speed + 4;
                    break;
            }
        }
    }
    public void decelerate() {
        if (isOn) {
            switch (gearType) {
                case "Gear 1":
                    speed = speed - 1;
                    break;
                case "Gear 2":
                    speed = speed - 2;
                    break;
                case "Gear 3":
                    speed = speed - 3;
                    break;
                case "Gear 4":
                    speed = speed - 4;
                    break;
                default:
                    break;
            }
        }

    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }
}
