public class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;

    }

    public synchronized void withdraw(int amount, int count) {
        if (balance >= amount) {
            System.out.println(count);
            System.out.println( " is withdrawing: " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(count);
            System.out.println( " tried to withdraw, but insufficient balance.");
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
