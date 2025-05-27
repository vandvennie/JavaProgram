public class MyStringExample2 {
    public static void main(String[] args) {
        MyString s = new MyString("Hello".toCharArray());
        s = s.concatenate(new MyString("World".toCharArray()));
        s = s.substring(3, 6);
        if (s.equals(new MyString("loW".toCharArray())))
            System.out.println("Success");
        else
            System.out.println("Failure");
        for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i));
    }
}