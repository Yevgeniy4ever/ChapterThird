package shiltd.mythreads;

import java.io.PrintWriter;

/**
 * Created by Yevgeniy on 13.05.2017.
 */
public class MyThreads implements Runnable {
    PrintWriter pw = new PrintWriter(System.out, true);
    Thread thrd;

    MyThreads(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        pw.println(thrd.getName() + " is running");

        for(int count = 0; count < 10; count ++){
            System.out.println(thrd.getName() + " count is " + count);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
        pw.println(thrd.getName() + " was finished");
    }
}

class MyThreadsStart{
    public static void main(String[] args) {
        MyThreads thrdOb1 = new MyThreads("Child #1");
        MyThreads thrdOb2 = new MyThreads("Child #2");
        MyThreads thrdOb3 = new MyThreads("Child #3");
        thrdOb1.thrd.setPriority(8);
        thrdOb2.thrd.setPriority(9);

        System.out.println("The main Thread");
        for(int i = 0; i < 50; i ++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The main Thread is finishing");
    }
}
