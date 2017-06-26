package techpark;

/**
 * Created by Developer on 6/21/2017.
 */
public class SeriesRunExample extends Thread{
    static int currentMax = 0;
    private int mainId;
    private final Object waitObject;

    public SeriesRunExample(int id, Object waitObject){
        this.mainId = id;
        this.waitObject = waitObject;
    }

    public static void example(){
        Object waitObject = new Object();
        for(int i = currentMax; i <= 10; ++i){
            Thread thread = new SeriesRunExample(i, waitObject);
            thread.start();
        }
    }

    public void run(){
        try{
            System.out.println("Start run of thread: " + mainId);
            synchronized (waitObject){
                while(mainId > currentMax){
                    System.out.println("Thread " + mainId + " is waiting");
                    waitObject.wait();

                }
                currentMax++;
                System.out.println("Hello from thread: " + mainId);
                waitObject.notifyAll();
            }
        } catch (Exception ex){
            ex.printStackTrace();

        }
    }
}
