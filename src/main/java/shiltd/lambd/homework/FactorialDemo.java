package shiltd.lambd.homework;

import shiltd.lambd.NumericFunc;

/**
 * Created by Developer on 6/2/2017.
 */
public class FactorialDemo {
    public static void main(String[] args) {
        MyFunc<Integer> demo = n -> {
            int k = 1;
            while (n != 0){
                k *= n;
                n --;
            }
            return k;
        };

        int k = 11;
        System.out.println("factorial of " + k + " is " + demo.func(k));
    }
}
