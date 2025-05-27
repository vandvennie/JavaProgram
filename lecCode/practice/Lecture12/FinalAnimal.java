abstract class Animal {
    public abstract int numLegs();
}

class Spider extends Animal {
    public final int numLegs() {
        // All spiders have 8 legs
        return 8;
    }
}

class SpiderWith6Legs extends Spider {
    // Error: Cannot override the final method from Spider
    // public int numLegs() {
    //     return 6;
    // }
}

final class Insect extends Animal {
    public int numLegs() {
        // All insects have 6 legs
        return 6;
    }
}

// class InsectWith8Legs extends Insect {
//     // Error: Cannot inherit from final Insect
// }

public class FinalAnimal {
    public static void main(String[] args) {
        Animal a = new Spider();
        System.out.println(a.numLegs());
    }
}