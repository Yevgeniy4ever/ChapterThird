package youtbthreads;

/**
 * Created by Developer on 6/21/2017.
 */
public class Account {
    private int balance;

    public Account(int initialBalance){
        this.balance = initialBalance;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void deposite(int amount){
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
