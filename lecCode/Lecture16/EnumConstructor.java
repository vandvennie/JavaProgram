enum Transport {
    BUS(50), TRAIN(100), FERRY(20), TRAM(30);

    private final int typicalSpeed;

    Transport(int typicalSpeed) {
        this.typicalSpeed = typicalSpeed;
    }

    public int getTypicalSpeed() {
        return typicalSpeed;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Transport.BUS.getTypicalSpeed());
        System.out.println(Transport.TRAIN.getTypicalSpeed());
    }
}