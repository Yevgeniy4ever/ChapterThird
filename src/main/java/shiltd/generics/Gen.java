package shiltd.generics;

/**
 * Created by Developer on 5/18/2017.
 */
public class Gen<T> {
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
