public class TypePromotion {
    public static void main(String[] args) {
        int x = 1;
        long y = 2;
        long z = x + y; // This is OK
        double d = z + y; // This is OK
        System.out.println(z);
        System.out.println(d);
    }
}
