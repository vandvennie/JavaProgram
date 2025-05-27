package vehicles;

public class Bicycle {
    private int topSpeed;

    public Bicycle(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int wheels() {
        return 2;
    }
}