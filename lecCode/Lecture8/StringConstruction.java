public class StringConstruction {
    public static void main(String[] args) {
        String s = "Hello";
        String s2 = new String("Hello");
        String s3 = new String(s);
        System.out.println(s + " " + s2 + " " + s3);
    }
}