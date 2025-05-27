public class ModifyString {
    public static void main(String[] args) {
        String s = "Heloo";
        char[] chars = s.toCharArray();
        chars[3] = 'l';
        s = new String(chars);
        System.out.println(s);
    }
}