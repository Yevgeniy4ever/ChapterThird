package techpark;

/**
 * Created by Developer on 6/20/2017.
 */
public class InterferenceThreadImpr extends Thread {
    private InterferenceExampleImpr checker;
    StateObject x;

    public InterferenceThreadImpr(StateObject x){
        this.x = x;
    }

    public void run() {
        while (!checker.stop()) {
            x.increment();
        }
    }


//    public static void increment(){
//        synchronized (lock) {
//            i++;
//        }
//    }

    StateObject getX(){
        return x;
    }

}

