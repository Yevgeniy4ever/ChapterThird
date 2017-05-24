package shiltd.generics;

/**
 * Created by Developer on 5/24/2017.
 */
public class QueueEmptyException extends Exception {

    @Override
    public String toString(){
        return "\nQueue is empty";
    }
}
