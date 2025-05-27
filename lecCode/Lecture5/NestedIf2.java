import java.util.Scanner; // Allows us to use short-name Scanner
public class NestedIf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Note how these are initialised to in order
        boolean x = sc.nextBoolean(), y = sc.nextBoolean();
        if (x) {
            if (y) {
                System.out.println("x && y");
            } else {
                System.out.println("x && !y");
            }
        }
    }
}