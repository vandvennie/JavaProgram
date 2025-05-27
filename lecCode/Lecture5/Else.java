public class Else {
    public static void main(String[] args) {
        double x = 2.3;
        if (x < 4/2.0) {
            // Needs braces if there is more than one statement
            System.out.println("Not executed 1");
            x = 0;
        } else {
            System.out.println("Executed 1");
        }
        if (x < 5/2.0)
            System.out.println("Executed 2");
        else
            System.out.println("Not executed 2");
    }
}