package shiltd.lambd;

/**
 * Created by Yevgeniy on 31.05.2017.
 */
public class MyIntNum {
    private int v;

    MyIntNum(int n){
        v = n;
    }

    int getNum(){
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
