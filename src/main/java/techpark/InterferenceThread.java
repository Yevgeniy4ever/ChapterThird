package techpark;

/**
 * Created by Developer on 6/20/2017.
 */
public class InterferenceThread extends Thread {
    private final InterferenceExample checker;
    private static int i;
//    private static Object lock = new Object();

    public InterferenceThread(InterferenceExample checker){
        this.checker = checker;
    }

    public void run() {
        while (!checker.stop()) {
            increment();
        }
    }

    public void increment(){
        synchronized (checker) {
            i++;
        }
    }

//    public static void increment(){
//        synchronized (lock) {
//            i++;
//        }
//    }

    public int getI() {
            return i;
    }

}

