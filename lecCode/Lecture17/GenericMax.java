public class GenericMax {
    public static <T extends Comparable<T>> T max(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(2, 1));
        System.out.println(max(1.0, 2.0));
        System.out.println(max("b", "a"));
    }
}