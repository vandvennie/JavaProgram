public class IfElseIfElse {
    public static void main(String[] args) {
        double x = 2.3;
        if (x < 4/2.0)
            System.out.println("x < 4/2");
        else if (x < 5/2.0)
            System.out.println("4/2 <= x < 5/2");
        else if (x < 6/2.0)
            System.out.println("5/2 <= x < 6/2");
        else
            System.out.println("x >= 6/2");
    }
}