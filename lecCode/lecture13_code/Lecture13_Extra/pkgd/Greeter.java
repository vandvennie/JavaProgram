package pkgd;

public class Greeter {
    private String greeting;

    public Greeter(String greeting) {
        this.greeting = greeting;
    }

    public void greet() {
        System.out.println(greeting);
    }
}