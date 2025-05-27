public class AutoboxMethod {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static Double max(Double a, Double b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Integer a = 1, b = 2;
        int sum = sum(a, b);
        System.out.println(sum);
        Double max = max(1.0, 2.0);
        System.out.println(max);
    }
}