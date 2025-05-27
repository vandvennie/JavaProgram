abstract class Animal {
    public abstract void talk();
}

class Goose extends Animal {
    @Override
    public void talk() {
        System.out.println("Honk!");
    }
}

public class AbstractAnimal {
    public static void main(String[] args) {
        Animal a = new Goose();
        a.talk();
    }
}