public class MultipleRefs {
    public static void main(String[] args) {
       Integer x =5;
       Integer y= x;
       x=x +2;
       System.out.println(x==y);

    }
}