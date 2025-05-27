package vehicles;

public class MotorBoat extends Boat {
    public MotorBoat(int topSpeed) {
        super(topSpeed);
    }

    public String description() {
        // We can access getTopSpeed because we're in the same package
        return "Motorboat with top speed " + getTopSpeed();
    }
}