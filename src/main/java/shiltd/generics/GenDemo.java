package shiltd.generics;

/**
 * Created by Developer on 5/18/2017.
 */
public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("value is " + v);

        System.out.println();

        Gen<String> strOb = new Gen<String>("Testing of generics");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("value is " + str);
    }
}
