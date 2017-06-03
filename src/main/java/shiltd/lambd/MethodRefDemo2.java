package shiltd.lambd;

/**
 * Created by Yevgeniy on 31.05.2017.
 */
public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum num1 = new MyIntNum(11);
        MyIntNum num2 = new MyIntNum(-3);

        IntPredicate pred = num1::isFactor;

        result = pred.test(3);
        if(result) System.out.println("3 is divider of " + num1.getNum());




    }
}
