public class Casting {
    public static void main(String[] args) {
        double d = 66.3;
        int num = (int) d;
        char c = (char) num;
        long l = 11123456789L;
        int x = (int) l;
        System.out.println("num=" + num);
        System.out.println("c=" + c);
        System.out.println("x=" + x);
    }
}
