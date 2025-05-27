import pkgd.Greeter;
import java.util.Scanner;

public class ClasspathExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a greeting: ");
        String greeting = in.nextLine();
        Greeter g = new Greeter(greeting);
        g.greet();
    }
}