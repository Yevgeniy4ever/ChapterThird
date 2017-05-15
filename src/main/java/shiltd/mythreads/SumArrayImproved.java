package shiltd.mythreads;

/**
 * Created by Yevgeniy on 13.05.2017.
 */
public class SumArrayImproved {
    int sum;

    int sumArray(int ar[]){
        sum = 0;
        for(int i = 0; i < ar.length; i ++){
            sum += ar[i];
            System.out.println(sum);
        }
        return sum;
    }

}

class MyThreadBlock implements Runnable{
    Thread thrd;
    static SumArrayImproved sa = new SumArrayImproved();
    int a[];
    int answer;

    MyThreadBlock(String name, int arr[]){
        thrd = new Thread(this, name);
        a = arr;
        thrd.start();
    }


    public void run(){
        int sum;



        System.out.println(thrd.getName() + " is starting");

        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println(thrd.getName() + " sum is " + answer);
        System.out.println(thrd.getName() + " is finishing ");
    }
}

class SyncImprovedStart{
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        MyThreadBlock thrdObl = new MyThreadBlock("Children #1", a);
        MyThreadBlock thrdOb2 = new MyThreadBlock("Children #2", a);
    }
}
