package shiltd.lambd;

/**
 * Created by Developer on 5/30/2017.
 */
public class BlockLambdaDemo {
    public static void main(String[] args) {


        NumericFunc smallestF = n -> {
            int result = 1;

            n = n < 0 ? -n : n;

            for (int i = 2; i <= n/i; i ++)
                if((n % i) == 0) {
                result = i;
                break;
                }

                return result;
        };

        System.out.println("Smallest divider of 12 is " + smallestF.func(12));
        System.out.println("Smallest divider of 11 is " + smallestF.func(11));

    }
}
