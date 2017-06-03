package shiltd.generics;

/**
 * Created by Yevgeniy on 19.05.2017.
 */
public class NumericFnsImproved<T extends Number> {
    private T num;

    NumericFnsImproved(T n){
        num = n;
    }

    T getNum(){
        return num;
    }

    double reciprocal(){
        return 1 / num.doubleValue();
    }

    double fraction(){
        return num.doubleValue() - num.intValue();
    }
}

class NumericFnsImprovedStart{
    public static void main(String[] args) {

        NumericFnsImproved<Integer> iOb = new NumericFnsImproved<Integer>(5);

        System.out.println("recipropal is " + iOb.reciprocal());

        System.out.println("fraction is " + iOb.fraction());

        NumericFnsImproved<Double> dOb = new NumericFnsImproved<Double>(5.25);

        System.out.println("recipropal is " + dOb.reciprocal());

        System.out.println("fraction is " + dOb.fraction());




    }
}
