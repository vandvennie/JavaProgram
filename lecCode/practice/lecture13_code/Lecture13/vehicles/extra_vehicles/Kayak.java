package vehicles.extra_vehicles;

import vehicles.Boat;

public class Kayak extends Boat {
    public Kayak(int topSpeed) {
        super(topSpeed);
    }

    @Override
    protected String description() {
        // Oh no, can't access getTopSpeed because it is package only
        return "Kayak with top speed " + getTopSpeed();
    }
}