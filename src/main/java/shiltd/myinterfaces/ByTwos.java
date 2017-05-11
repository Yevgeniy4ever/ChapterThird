package shiltd.myinterfaces;

/**
 * Created by Developer on 4/20/2017.
 */
public class ByTwos implements Series {
    int start;
    int val;

    ByTwos(){
        start = 0;
        val = 0;
    }

    @Override
    public int getNext(){
        val +=2;
        return val;
    }

    @Override
    public void reset(){
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x){
        val = x;
        start = x;
    }
}

class ByThrees implements Series{
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo2{
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for(int i = 0; i < 5; i++){
            ob = twoOb;
            System.out.println("ByTwos next value is: " + ob.getNext());
            ob = threeOb;
            System.out.println("ByThrees next value is " + ob.getNext());
        }
    }
}
