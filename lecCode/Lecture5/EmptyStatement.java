public class EmptyStatement {
    public static void main(String[] args) {
        ;;; // Empty statements
        int x = 10;
        for (x = 0; x < 3; x++);
        System.out.println("x=" + x);
    }
}