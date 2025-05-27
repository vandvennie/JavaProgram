public class Assignment {
    public static void main(String[] args) {
        int x;
        int y = (x = 10);
        y++;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
