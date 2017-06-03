package shiltd.lambd.homework;

/**
 * Created by Developer on 6/2/2017.
 */
public class ResultDemo {
    public static void main(String[] args) {

        IOResult res = (n) -> n>=10 && n<=20;
        if (res.isCorrect(11)) System.out.println("The nymber is correct");
    }
}
