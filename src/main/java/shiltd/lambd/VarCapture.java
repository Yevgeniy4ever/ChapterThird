package shiltd.lambd;

/**
 * Created by Developer on 5/31/2017.
 */
public class VarCapture {
    public static void main(String[] args) {

        int num = 10;

        MyFunc myLambda = (n) -> {
          int v = num + n;
          return v;
        };
        System.out.println(myLambda.func(8));
    }
}
