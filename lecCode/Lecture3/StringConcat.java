public class StringConcat {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String s1 = a+b+"";//30
        String s2 = ""+a+b;//1020
        System.out.println(s1);
        System.out.println(s2);
    }
}