package youtbthreads;

import javax.naming.InsufficientResourcesException;

/**
 * Created by Developer on 6/21/2017.
 */
public class Operations {

    public static void main(String[] args) {
        final Account a = new Account(1000);
        final Account b = new Account(2000);
        try {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        transfer(a, b, 500);
                        System.out.println("first transfer succesfull ");
                    } catch (InsufficientResourcesException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            transfer(b, a, 300);
            System.out.println("second transfer succesfull ");

        } catch (InsufficientResourcesException ex) {
            System.out.println(ex);
        }
    }

    static void transfer(Account acc1, Account acc2, int amount) throws InsufficientResourcesException{
        if(acc1.getBalance() < amount) throw new InsufficientResourcesException();

        acc1.withdraw(amount);
        acc2.deposite(amount);

    }
}
