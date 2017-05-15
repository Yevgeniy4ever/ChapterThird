package shiltd.mythreads;

import java.io.IOException;

/**
 * Created by Yevgeniy on 13.05.2017.
 */
public class MyThreadJoin implements Runnable{
    Thread thrd;

    MyThreadJoin(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName() + " is started");
        for (int count = 0; count < 10; count ++){
            System.out.println(thrd.getName() + " count is " + count);
            try{
                Thread.sleep(400);
            } catch (InterruptedException ex){
                System.out.println("Error " + ex);
            }
        }
    }
}

class MyThreadJoinStart{
    public static void main(String[] args) {
        MyThreadJoin thrdObj1 = new MyThreadJoin("Children #1");
        MyThreadJoin thrdObj2 = new MyThreadJoin("Children #2");
        MyThreadJoin thrdObj3 = new MyThreadJoin("Children #3");

        try{
            thrdObj1.thrd.join();
            System.out.println(thrdObj1.thrd.getName() + " is connected");
            thrdObj2.thrd.join();
            System.out.println(thrdObj2.thrd.getName() + " is connected");
            thrdObj3.thrd.join();
            System.out.println(thrdObj3.thrd.getName() + " is connected");
        } catch (InterruptedException ex){
            ex.printStackTrace();
            ex.printStackTrace();
            System.out.println("Error" + ex);
        }
        System.out.println("The main thread is finished");
    }
}
