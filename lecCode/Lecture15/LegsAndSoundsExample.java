abstract class Insect implements HasLegs {
    @Override
    public int countLegs() {
        return 6;
    }
}

class Cricket extends Insect implements HasLegsAndMakesSounds {
    @Override
    public String sound() {
        return "Chirp";
    }
}

class SqueakyChair implements HasLegsAndMakesSounds {
    @Override
    public int countLegs() {
        return 4;
    }

    @Override
    public String sound() {
        return "Squeak";
    }
}

public class LegsAndSoundsExample {
    public static void main(String[] args) {
        HasLegsAndMakesSounds[] things = {new Cricket(), new SqueakyChair()};
        for (HasLegsAndMakesSounds thing : things) {
            System.out.println(thing.sound());
            System.out.println(thing.countLegs());
        }
    }
}