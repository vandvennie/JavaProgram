public class ForWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <=10) {
            System.out.println("while i=" + i);
            i++;
        }
        // No need to redeclare i
        // We can omit {} since it's only one statement
        for (i = 1; i <= 10; i++)
            System.out.println("for i=" + i);
    }
}