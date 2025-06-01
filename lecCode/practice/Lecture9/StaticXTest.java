public class StaticXTest {
    public static void main(String[] args) {
       StaticX x1 =  new StaticX();
       StaticX x2 = new StaticX();
       x1.x = "V";
        x2.x = "H";
        StaticX.x = "C";
        System.out.println(x1.x+" "+x2.x+" "+StaticX.x);

    }
}