public class NestedIf {
    public static void main(String[] args) {
        boolean x = true, y = false;
        if (x) {
            if (y) {
                System.out.println("x && y");
            } else {
                System.out.println("x && !y");
            }
        }
    }
}