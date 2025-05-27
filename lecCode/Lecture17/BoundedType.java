abstract class Bird {
}

class Emu extends Bird {
}

class Hawk extends Bird {
}

class BirdPair<T extends Bird> {
    public T first;
    public T second;

    public BirdPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
}

public class BoundedType {
    public static void main(String[] args) {
        var emuPair = new BirdPair<Emu>(new Emu(), new Emu());
        var hawkPair = new BirdPair<Hawk>(new Hawk(), new Hawk());
        var birdPair = new BirdPair<Bird>(new Emu(), new Hawk());
        // var badPair = new BirdPair<String>("Hello", "World"); // compile-time error
    }
}