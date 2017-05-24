package shiltd.generics;

/**
 * Created by Developer on 5/24/2017.
 */
public class GenQueue<T> implements IGenQ<T> {
    T queue[];
    T obj;
    private int size;
    private int putloc, getloc;

    GenQueue(T ob[]){
        queue = ob;
        putloc = getloc = 0;
    }


/*    public T[] getQueue(){

    }*/

    public void putObj(T o) throws QueueFullException{
        if (putloc == queue.length)
            throw new QueueFullException(queue.length);
        obj = o;
        putloc ++;
    }

    public T getObj() throws QueueEmptyException{
        if (getloc == 0 && queue[getloc] == null)
            throw new QueueEmptyException();
        getloc--;
        return obj;
    }

    void setSize(int s){
        size = s;
    }
}
