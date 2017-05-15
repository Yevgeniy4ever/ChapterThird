package shiltd.mythreads;

/**
 * Created by Yevgeniy on 13.05.2017.
 */
public class SumArray {
    private int sum;

    synchronized int SumArray(int nums[]){
        sum = 0;

        for(int i = 0; i < nums.length; i ++){
            sum += nums[i];
            System.out.println("Current value of " + Thread.currentThread().getName() + " is " + sum);
            try{
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("Error " + ex);
            }
        }

        return sum;
    }
}

class MyThreadSync implements Runnable{
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    MyThreadSync(String name, int nums[]){
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    public void run(){
        int sum;

        System.out.println(thrd.getName() + " is starting...");

        answer = sa.SumArray(a);

        System.out.println("Summary for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " is finishing");
    }
}

class StartSummArray{
    public static void main(String[] args) {
    int a[] = {1, 2, 3, 4, 5};
    MyThreadSync thrdObj1 = new MyThreadSync("Child #1", a);
    MyThreadSync thrdObj2 = new MyThreadSync("Child #2", a);


    System.out.println("The main Thread is started");
    }
}