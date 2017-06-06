package shiltd.lambd.homework;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created by Yevgeniy on 03.06.2017.
 */
public class DemoBinary {
    public static void main(String[] args) {
        MyClass<Integer> ob = new MyClass<>();

        ConstHome<Integer> ob1 = MyClass<Integer>::new;

        MyClass<Integer> first = ob1.newOb(11);

        MyFunc<Integer> supInt = ob::ref;
        Predicate<Integer> supIs = ob::isIt;

        System.out.println(supIs.test(11));
        System.out.println(supInt.func(11));
    }

}
