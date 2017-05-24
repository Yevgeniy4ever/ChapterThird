package shiltd.generics;

/**
 * Created by Developer on 5/24/2017.
 */
public class Summation {

    private int sum;

    <T extends Number> Summation(T arg){
        sum = 0;

        for (int i = 0; i <= arg.intValue(); i ++){
            sum += i;
        }
    }

    int getSum(){
        return sum;
    }
}

class GenConsDemo{
    public static void main(String[] args) {
        //Summation ob =
    }
}
