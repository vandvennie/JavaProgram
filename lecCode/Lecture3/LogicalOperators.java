public class LogicalOperators {
    public static void main(String[] args) {
        boolean mystery = (1<3) || (3>2) && !(3<4);
        if (mystery)
            System.out.println("mystery is true");
        else
            System.out.println("mystery is false");
    }
}