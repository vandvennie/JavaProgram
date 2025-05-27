public class BankExample6 {
    public static void main(String[] args) {
        BankAccount6 account1 = new BankAccount6("Donald Knuth", 1000);
        BankAccount6 account2 = new BankAccount6("Alan Turing");
        System.out.println(account1.ownerName + " has $" + account1.balance);
        System.out.println(account2.ownerName + " has $" + account2.balance);
    }
}