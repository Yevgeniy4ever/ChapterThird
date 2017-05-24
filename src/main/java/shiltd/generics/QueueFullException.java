package shiltd.generics;

/**
 * Created by Developer on 5/24/2017.
 */
public class QueueFullException extends Exception{
    int size;

    QueueFullException(int s) {
        size = s;
    }

    @Override
    public String toString(){
        return "\n Queue is full. Maximum size of queue is " + size;
    }

}
