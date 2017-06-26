package techpark;

/**
 * Created by Developer on 6/20/2017.
 */
public class StateObject {
    private int i;

    public synchronized void increment(){
        i++;
    }

    public int getI(){
        return i;
    }
}
