package shiltd.statimport;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;

/**
 * Created by Developer on 5/18/2017.
 */
public class QuadraticImproved {
    public static void main(String[] args) {
        double a, b, c, x;

        a = 4;
        b = 1;
        c = -3;

        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        out.println("First avg is " + x);

        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        out.println("Second avg is " + x);
    }

}
