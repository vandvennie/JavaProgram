public class IntTypes {
    public static void main(String[] args) {
        int a = 1_000_000_000_000; // error: integer number too large

        /*
        error: incompatible types: possible lossy conversion from long to int
        Note: need to remove the other errors before we see this one.
        Also note: this is a multiline comment!
        */
        int b = 1_000_000_000_000L;

        long c = 1_000_000_000_000; // error: integer number too large

        long d = 1_000_000_000_000L;
    }
}