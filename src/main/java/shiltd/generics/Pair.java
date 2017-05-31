package shiltd.generics;

/**
 * Created by Yevgeniy on 19.05.2017.
 */
public class Pair<T, V extends T> {
    T ob1;
    V ob2;

    Pair(T o1,V o2){
        ob1 = o1;
        ob2 = o2;
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }


}
