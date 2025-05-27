abstract class Insect implements HasLegs {
    @Override
    public int countLegs() {
        return 6;
    }
}

class Cricket extends Insect implements MakesSounds {
    @Override
    public String sound() {
        return "Chirp";
    }
}

class SqueakyChair implements HasLegs, MakesSounds {
    @Override
    public int countLegs() {
        return 4;
    }

    @Override
    public String sound() {
        return "Squeak";
    }
}

public class SoundExample {
    public static void main(String[] args) {
        MakesSounds[] things = {new Cricket(), new SqueakyChair()};
        for (MakesSounds thing : things)
            System.out.println(thing.sound());
        HasLegs[] legs = {new Cricket(), new SqueakyChair()};
        for (HasLegs leg : legs)
            System.out.println(leg.countLegs());
    }
}