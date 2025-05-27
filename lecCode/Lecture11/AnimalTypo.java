class Animal {
    public void talk() {
        System.out.println("*Generic animal sounds*");
    }
}

class Goose extends Animal {
    public void tallk() { // Oops, typo!
        System.out.println("Honk!");
    }
}

public class AnimalTypo {
    public static void main(String[] args) {
        Animal a = new Goose();
        a.talk();
    }
}