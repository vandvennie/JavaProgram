class Animal {
    public int numLegs() {
        return 0;
    }
}

class Dog extends Animal {
    public int numLegs() {
        return 4;
    }
}

class Seagull extends Animal {
    public int numLegs() {
        return 2;
    }
}

class SeagullStandingOnOneLeg extends Seagull {
    public int numLegs() {
        return 1;
    }
}

public class LegCount {
    // Works for any Animal subclass!
    public static int countLegs(Animal[] animals) {
        int sum = 0;
        for (Animal a : animals)
            sum += a.numLegs(); // Polymorphism!
        return sum;
    }

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Seagull(), new SeagullStandingOnOneLeg()};
        System.out.println("Total number of legs: " + countLegs(animals));
    }
}

