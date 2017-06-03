package shiltd.generics;

/**
 * Created by Developer on 5/25/2017.
 */
class SimpleGen<T> {
    T ob;

    SimpleGen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }
}

class RawDemo{
    public static void main(String[] args) {
        SimpleGen<Integer> iOb = new SimpleGen<Integer>(88);

        SimpleGen<String> strOb = new SimpleGen<String>("testing of messages");

        SimpleGen raw = new SimpleGen(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println("value i s " + d);

        //int i = (Integer) raw.getOb();
        strOb = raw;
        // String str = strOb.getOb();
    }
}
