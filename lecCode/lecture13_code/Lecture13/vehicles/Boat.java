package vehicles;

public class Boat {
    private int topSpeed;

    public Boat(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    int getTopSpeed() {
        return topSpeed;
    }

    protected String description() {
        return "Boat with top speed " + getTopSpeed();
    }
}