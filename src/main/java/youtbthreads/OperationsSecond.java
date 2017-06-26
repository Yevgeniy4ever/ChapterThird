package youtbthreads;

import javax.naming.InsufficientResourcesException;

/**
 * Created by Developer on 6/21/2017.
 */
public class OperationsSecond {

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
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            transfer(b, a, 300);
            System.out.println("second transfer succesfull ");

        } catch (InsufficientResourcesException ex) {
            System.out.println(ex);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void transfer(Account acc1, Account acc2, int amount) throws InsufficientResourcesException, InterruptedException {
        if(acc1.getBalance() < amount) throw new InsufficientResourcesException();

        synchronized (acc1){
            System.out.println("I have taken first object");
            Thread.sleep(1000);
            synchronized (acc2){
                System.out.println("I have taken second object");
                acc1.withdraw(amount);
                acc2.deposite(amount);
            }

        }
    }
}
