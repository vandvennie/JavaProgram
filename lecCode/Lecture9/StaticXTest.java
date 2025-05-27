public class StaticXTest {
    public static void main(String[] args) {
        StaticX instance = new StaticX();
        StaticX instance2 = new StaticX();
        instance.x = "Hello";
        instance2.x = "Goodbye";
        StaticX.x = "World";
        System.out.println(StaticX.x + " " + instance.x + " " + instance2.x);
    }
}