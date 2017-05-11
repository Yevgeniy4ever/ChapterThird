package shiltd.myinterfaces;

/**
 * Created by Developer on 4/20/2017.
 */
public interface ICharQ {
    void put(char ch);
    char get();

    default int getInt(){
        return 1;
    }
}
