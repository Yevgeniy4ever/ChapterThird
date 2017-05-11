package shiltd.myinterfaces;

/**
 * Created by Developer on 4/21/2017.
 */
public class DynQueue implements ICharQ {
    private int getloc, putloc;
    private char arr[];

    DynQueue(int size){
        arr = new char[size + 1];
        getloc = putloc = 0;
    }



    @Override
    public void put(char ch) {

    }

    @Override
    public char get() {
        return 0;
    }

    public void reset(){

    }
}
