public class BankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.ownerName = "Donald Knuth";
        account.balance = 1000;
        account.balance -= 15;
        System.out.println(account.ownerName + " has $" + account.balance);
    }
}