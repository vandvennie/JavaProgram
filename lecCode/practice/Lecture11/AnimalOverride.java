class Animal {
    public void talk() {
        System.out.println("*Generic animal sounds*");
    }
}

class Goose extends Animal {
    public void talk() {
        super.talk();
        System.out.println("Honk!");
    }
}

class Dog extends Animal {
    public void talk() {
        System.out.println("Woof!");
    }
}

public class AnimalOverride {
    public static void main(String[] args) {
        Goose a = new Goose();
        a.talk();
        // a = new Goose();
        // a.talk();
        // a = new Dog();
        // a.talk();
    }
}