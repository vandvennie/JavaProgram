public class NestedScope {
    public static void main(String[] args) {
        int x = 5;
        if (true) {
            int y = 10;
            if (true) {
                int z = 20;
                // x, y, and z are all in scope here
            }
            // x and y are in scope here, but not z
        }
        // x is in scope here, but not y or z
    }
}
