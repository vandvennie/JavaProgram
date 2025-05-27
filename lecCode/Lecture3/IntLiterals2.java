public class IntLiterals2 {
    public static void main(String[] args) {
        long a = 0b1111111111111111111111111111111111111111L;
        long b = 0x1FFFFFFFFFFL;
        System.out.println(a); //1099511627775
        System.out.println(b); //2199023255551
    }
}