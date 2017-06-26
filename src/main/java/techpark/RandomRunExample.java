package techpark;

/**
 * Created by Developer on 6/20/2017.
 */
public class RandomRunExample extends Thread {

    @Override
    public void run(){
        System.out.println("Name of the Thread is " + Thread.currentThread().getName());
    }

    public static void example(){
        for(int i = 0; i < 10; i++){
            Thread thread = new RandomRunExample();
            thread.start();
        }
    }
}
