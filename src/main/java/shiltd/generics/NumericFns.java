package shiltd.generics;

/**
 * Created by Developer on 5/18/2017.
 */
public class NumericFns <T extends Number>{
    T num;

    NumericFns(T n){
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction(){
        return num.doubleValue();
    }

    //...
}

class BoundsDemo{
    public static void main(String[] args) {

        NumericFns<Integer> iOb = new NumericFns<Integer>(5);

        System.out.println("reciprocal is " + rec);
    }
}
