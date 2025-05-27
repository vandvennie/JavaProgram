public class Floats {
    public static void main(String[] args) {
        float f = 1.1f;
        double d = 1.0;
        ++f;
        d = (d / 7.0)*1000000.0;
        System.out.println(f); //2.1
        System.out.println(d);
    }
}