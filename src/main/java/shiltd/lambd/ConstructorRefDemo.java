package shiltd.lambd;

/**
 * Created by Developer on 6/1/2017.
 */
public class ConstructorRefDemo {
    public static void main(String[] args) {

        MyFuncConstructor myClassCons = MyFuncClass::new;

        MyFuncClass mc = myClassCons.func("Testing");

        System.out.println("String str in mc is " + mc.getStr());

    }
}
