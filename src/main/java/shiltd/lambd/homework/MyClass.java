package shiltd.lambd.homework;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/**
 * Created by Yevgeniy on 03.06.2017.
 */
public class MyClass<T> {
    T ob;

    MyClass(){

    }

    MyClass(T obj){
        ob = obj;
    }

    T ref(T obj){
        return obj;
    }

    boolean isIt(T ob){
        int i = 11;
        if(i > 10)
            return true;
        return false;
    }
}
