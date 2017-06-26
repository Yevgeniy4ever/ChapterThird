package techpark;

/**
 * Created by Developer on 6/20/2017.
 */
public class StartMyThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread("Name is ok");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from the main");
        (new MyThread("New name")).start();
    }
}
