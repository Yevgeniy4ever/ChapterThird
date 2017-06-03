package shiltd.generics;

/**
 * Created by Yevgeniy on 19.05.2017.
 */
public class NumericFnsMeth<T extends Number> {
    T first;

    NumericFnsMeth(T f) {
        first = f;
    }

    double recipropal() {
        return 1 / first.doubleValue();
    }

    double fraction() {
        return first.doubleValue() / first.intValue();
    }

    boolean absEqual(NumericFnsMeth<?> ob) {
        if (Math.abs(first.doubleValue()) == Math.abs(ob.first.doubleValue())) return true;

        return false;
    }
}

class WildCardDemo{
    public static void main(String[] args) {

        NumericFnsMeth<Integer> iOb = new NumericFnsMeth<Integer>(6);

        NumericFnsMeth<Double> dOb = new NumericFnsMeth<Double>(-6.0);

        NumericFnsMeth<Long> lOb = new NumericFnsMeth<>(5L);

        System.out.println("Comparison iOb and dOb.");
        if(iOb.absEqual(dOb)) System.out.println("absolute values equal");
        else System.out.println("absolute values don't equal");

        System.out.println();

        System.out.println("Comparison iOb and lOb");

        if(iOb.equals(lOb)) System.out.println("absolute values equal");
        else System.out.println("absolute values don't equal");

    }
}
