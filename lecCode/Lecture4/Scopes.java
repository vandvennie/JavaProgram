public class Scopes {
    public static void main(String[] args) {
        if (true) {
            // This is a scope
        }
        while (true) {
            // This is a scope
        }
        for (int i = 0; i < 10; i++) {
            // This is a scope
        }
        {
            // This is a scope (by itself!)
        }
    }
}
