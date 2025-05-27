public class MultipleRefs {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = a;
        a += 2;
        System.out.println(a);
        System.out.println(b);
    }
}