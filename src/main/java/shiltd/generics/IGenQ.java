package shiltd.generics;

/**
 * Created by Developer on 5/24/2017.
 */
public interface IGenQ <T>{
    T getObj() throws QueueEmptyException;
    void putObj(T o) throws QueueFullException;
}
