package vehicles;

public class Car {
    private int topSpeed;

    public Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int wheels() {
        return 4;
    }
}