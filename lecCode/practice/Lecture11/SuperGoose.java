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

public class SuperGoose {
    public static void main(String[] args) {
        Goose a = new Goose();
        a.talk();
    }
}