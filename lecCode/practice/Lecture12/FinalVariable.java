public class FinalVariable {
    public static void main(String[] args) {
        final int x = 5;
        // x = 6; // Error: Cannot assign a value to final variable 'x'
        final double y;
        y = 10.5;
        // y = 1.1; // Error: Cannot assign a value to final variable 'y'
        System.out.println(x);
        System.out.println(y);
    }
}