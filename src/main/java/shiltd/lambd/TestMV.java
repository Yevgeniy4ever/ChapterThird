package shiltd.lambd;

/**
 * Created by Developer on 5/26/2017.
 */
public class TestMV {
    public static void main(String[] args) {
        MyValue myVal;

        myVal = () -> 98.6;
        System.out.println(myVal.getValue());

        MyParamValue myPval = (n) -> 1.0/n;
        System.out.println("Value is " + myPval.getValue(4.0));

        MyTransform<Double> sqrts = (v) -> {
            for(int i = 0; i < v.length; i++)
                v[i] = Math.sqrt(v[i]);
        };
    }
}

