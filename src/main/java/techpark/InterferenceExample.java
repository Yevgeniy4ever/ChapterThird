package techpark;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Developer on 6/20/2017.
 */
public class InterferenceExample {
    private static final int HundredMillion = 100_000_000;
    private AtomicInteger counter = new AtomicInteger();


    public boolean stop(){
        return counter.incrementAndGet() > HundredMillion;
    }


    public void example() throws InterruptedException{
        InterferenceThread thread1 = new InterferenceThread(this);
        InterferenceThread thread2 = new InterferenceThread(this);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Expected: " + HundredMillion);
        System.out.println("Result: " + thread1.getI());

    }
}
