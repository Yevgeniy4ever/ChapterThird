package shiltd.generics;

/**
 * Created by Developer on 5/23/2017.
 */



class A{

}

class B extends A{

}

class C extends A{

}

class D{

}

public class UseBoundWildCard {

    static void test(Gen<? extends A> o){
        //....
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<>(c);
        Gen<D> w4 = new Gen<>(d);

        test(w);
        test(w2);
        test(w3);

        //test(w4);
    }
}

