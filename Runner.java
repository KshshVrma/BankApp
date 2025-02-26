import java.lang.*;

public class Runner extends Thread {
    private Bank account;
    private int amount;
    private int count;

    public Runner(Bank account, int amount, int count) {
        this.account = account;
        this.amount = amount;
        this.count = count;
    }

    @Override
    public void run() {

        account.withdraw(amount, count);
    }

}
