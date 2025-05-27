public class TypePromotion2 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        // Would only cast a!
        // char ab = (char) a + b;
        char ab = (char) (a + b);
        char c = (char) (b + 1);
        char z = 'y' + 1; // This is a sepcial case!
    }
}
