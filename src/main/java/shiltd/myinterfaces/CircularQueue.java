package shiltd.myinterfaces;

/**
 * Created by Developer on 4/20/2017.
 */
public class CircularQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if(putloc == q.length) putloc = 0;
        q[putloc] = ch;
    }

    public char get(){
        if(getloc == putloc){
            System.out.println(" - queue is empty");
            return (char) 0;
        }

        getloc++;
        if(getloc==q.length) getloc = 0;
        return q[getloc];
    }
}
