public class IntLiterals {
    public static void main(String[] args) {
        int a = 1_000_000; // Decimal
        int b = 0b101; // 0 or 1. 1*2^2 + 0*2^1 + 1*2^0
        int c = 0x1_F; // 0-9, A-F. 1*16^1 + 15*16^0
        int d = 0172; // 0-7. 1*8^2 + 7*8^1 + 2*8^0
        System.out.println(a);
        System.out.println(b); //5
        System.out.println(c); //31
        System.out.println(d); //122
    }
}