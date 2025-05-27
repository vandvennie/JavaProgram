public class BankExample2 {
    public static void main(String[] args) {
        BankAccount account1, account2;
        account1 = new BankAccount();
        account2 = new BankAccount();
        account1.ownerName = "Donald Knuth";
        account1.balance = 1000;
        account1.balance -= 15;
        account2.ownerName = "Alan Turing";
        account2.balance = 2000;
        account2.balance -= 77;
        account1.balance += account2.balance;
        System.out.println(account1.ownerName + " has $" + account1.balance);
        System.out.println(account2.ownerName + " has $" + account2.balance);
    }
}