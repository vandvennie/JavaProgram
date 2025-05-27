public class BankExample4 {
    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2();
        account.ownerName = "Donald Knuth";
        account.balance = 1000;
        account.depositMoney(500);
        System.out.println(account.ownerName + " has $" + account.balance);
    }
}