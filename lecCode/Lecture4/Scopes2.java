public class Scopes2 {
    public static void main(String[] args) {
        int x = 5;
        if (true) {
            // Duplicate names are not allowed!
            // int x = 2;
            int y = 10;
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }
        for (int i = 0; i < 1; i++) {
            int y = 20;
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }
        System.out.println("x=" + x);
        // y cannot be accessed here!
        // System.out.println("y=" + y);
    }
}
