package shiltd.lambd;

import java.io.PrintWriter;

/**
 * Created by Developer on 5/30/2017.
 */
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out, true);

        SomeTest<Integer> isFactor = (n, m) -> (n % m) == 0;

        if(isFactor.test(10, 2))
        writer.println("2 is divisor of 10");
        System.out.println();

        SomeTest<Double> isFactorD = (l, k) -> (l % k) == 0;

        if(isFactorD.test(212.0, 4.0))
            System.out.println("4.0 is divisor of 212.0");
        System.out.println();

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic functiopnal interface";

        if(isIn.test(str, "face"))
            System.out.println("Face is found");
        else System.out.println("Face is not found");

    }
}
