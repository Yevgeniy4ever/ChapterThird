package techpark;

/**
 * Created by Developer on 6/20/2017.
 */
public class StartHelloRunnable {
    public static void main(String[] args) {

        Thread whichIsThread = Thread.currentThread();
        System.out.println(whichIsThread);
        HelloRunnable newRun = new HelloRunnable();
        System.out.println(whichIsThread);
        MyThread thread2 = new MyThread("Sleeping");

        /*try {
            newRun.thread.join();
            System.out.println(whichIsThread = Thread.currentThread());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            return;
        }
        System.out.println("Point");

        whichIsThread = Thread.currentThread();
        System.out.println(whichIsThread);



    }
}
