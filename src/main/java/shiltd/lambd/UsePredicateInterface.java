package shiltd.lambd;

import java.util.function.Predicate;

/**
 * Created by Developer on 6/1/2017.
 */
public class UsePredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = (a) -> a > 0;

        System.out.println("The number 12 is positive " + isPositive.test(12));

        Predicate<Integer> isEven = (n) -> (n % 2) == 0;

        if(isEven.test(4)) System.out.println("4 is even");

        if(!isEven.test(5)) System.out.println("5 is nit even");
    }
}
