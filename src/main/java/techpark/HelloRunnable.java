package techpark;

/**
 * Created by Developer on 6/20/2017.
 */
public class HelloRunnable implements Runnable {
    Thread thread;

    HelloRunnable(){
        thread = new Thread(this);
        thread.start();
    }

    public void run(){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                return;
            }
        for(int i = 0; i < 100; i++)
            System.out.println("Hello new thread");
            if (Thread.interrupted()){
                return;
            }

    }
}
