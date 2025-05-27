abstract class Animal {
    public abstract void talk();
}

class Goose extends Animal {
    // Error: Did not override abstract method talk()
}

public class AbstractError {
    public static void main(String[] args) {
        Animal a = new Animal(); // Error: Cannot instantiate the type Animal
        a.talk();
    }
}