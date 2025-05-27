// class Bird {
//     void fly() { ... }
// }

// class Penguin extends Bird {
//     @Override
//     void fly() {
//         throw new UnsupportedOperationException("Penguins can't fly");
//     }
// }

public abstract class Bird {
    abstract void move();
}

class FlyingBird extends Bird {
    @Override
    void move() {
        fly();
    }

    void fly() {
        // Not real code
    }
}

class NonFlyingBird extends Bird {
    @Override
    void move() {
        walk();
    }

    void walk() {
        // Not real code
    }
}