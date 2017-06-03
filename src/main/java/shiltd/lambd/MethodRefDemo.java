package shiltd.lambd;

/**
 * Created by Yevgeniy on 31.05.2017.
 */
public class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v){
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        result = numTest(MyIntPredicates::isEven, 12);
        System.out.println("Even of 12 is " + result);

        result = numTest(MyIntPredicates::isPositive, 13);
        if(result) System.out.println("The 13 is positive number");


    }
}
