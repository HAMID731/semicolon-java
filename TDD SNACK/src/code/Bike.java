package code;

public class Bike {
    private boolean isOn;
    private int speed;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        speed = 0;
    }

    public void accelerate() {
        if (isOn) {
            if (speed >= 0 && speed <= 20) {
                speed += 1;
            }
            else if (speed >= 21 && speed <= 30){
                speed += 2;
            }
            else if (speed >= 31 && speed <= 40){
                speed += 3;
            }
            else if (speed >= 41){
                speed += 4;
            }
        }
    }

    public void decelerate() {
        if (isOn) {
           if (speed >= 0 && speed <= 20) {
               speed -= 1;
           }
           else if (speed >= 21 && speed <= 30) {
               speed -= 2;
           }
           else if (speed >= 31 && speed <= 40) {
               speed -= 3;
           }
           else if (speed >= 41) {
               speed -= 4;
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
