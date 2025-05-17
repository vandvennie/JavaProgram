public class WordTools {
    public static boolean isWord(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLowerCaseWord(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLowerCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUpperCaseWord(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSarcasmCaseWord(String s) {
        if (!isWord(s))
            return false;
        for (int i = 0; i < s.length()-1; i++) {
            boolean upper = Character.isUpperCase(s.charAt(i));
            if (upper == Character.isUpperCase(s.charAt(i+1)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isWord("Hello")); // true
        System.out.println(isWord("Hello!")); // false
        System.out.println(isWord("H ello")); // false
        System.out.println(isLowerCaseWord("hello")); // true
        System.out.println(isLowerCaseWord("hI")); // false
        System.out.println(isUpperCaseWord("TEST")); // true
        System.out.println(isUpperCaseWord("TEST ")); // false
        System.out.println(isUpperCaseWord("tEST")); // false
        System.out.println(isSarcasmCaseWord("tEsT")); // true
        System.out.println(isSarcasmCaseWord("TeSt")); // true
        System.out.println(isSarcasmCaseWord("test")); // false
        System.out.println(isSarcasmCaseWord("TeST")); // false
    }
}