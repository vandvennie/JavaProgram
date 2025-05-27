class BankAccount3 {
    String ownerName;
    int balance;

    void depositMoney(int amount) {
        if (amount < 0) {
            System.out.println("You can't deposit a negative amount!");
            return;
        }
        balance += amount;
    }
}