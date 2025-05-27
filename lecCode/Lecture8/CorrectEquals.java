public class CorrectEquals {
    public static void main(String[] args) {
        String s = "CITS2005";
        String s2 = new String("CITS2005");
        if (s.equals(s2)) {
            System.out.println("s == s2");
        } else {
            System.out.println("s != s2");
        }
    }
}