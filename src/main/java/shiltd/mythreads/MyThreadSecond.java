package shiltd.mythreads;

import java.io.PrintWriter;

/**
 * Created by Developer on 5/12/2017.
 */
public class MyThreadSecond implements Runnable {
    Thread thrd;
    PrintWriter pw = new PrintWriter(System.out, true);

    MyThreadSecond(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        try{
            for (int count = 0; count < 10; count ++){
                pw.println(thrd.getName() + " is starting");
                Thread.sleep(400);
                pw.println("In " + thrd.getName() + ", counter is " + count);
            }
        } catch (InterruptedException ex){
            pw.println("Error" + ex);
        }
        pw.println(thrd.getName() + "is finishing");
    }

}

class UseThreadsImproved{
    public static void main(String[] args) {

    }
}
