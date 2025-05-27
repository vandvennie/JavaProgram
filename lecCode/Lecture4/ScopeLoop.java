public class ScopeLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int j = 10;
            System.out.println("j=" + j);
            j = 100;
        }
    }
}
