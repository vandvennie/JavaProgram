public class BankExample3 {
    public static void main(String[] args) {
        BankAccount account1, account2;
        account1 = new BankAccount();
        account2 = account1;  // Same object
        account1.ownerName = "Donald Knuth";
        account1.balance = 1000;
        account1.balance -= 15;
        System.out.println(account1.ownerName + " has $" + account1.balance);
        System.out.println(account2.ownerName + " has $" + account2.balance);
    }
}