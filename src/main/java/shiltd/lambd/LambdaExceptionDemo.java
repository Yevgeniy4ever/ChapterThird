package shiltd.lambd;

/**
 * Created by Developer on 5/31/2017.
 */
public class LambdaExceptionDemo {

    public static void main(String[] args) {
        double[] values = { 1.0, 2.0, 3.0, 4.0};

        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();

            return true;
        };
    }
}
