package shiltd.mythreads;

import java.io.PrintWriter;

/**
 * Created by Yevgeniy on 11.05.2017.
 */
public class MyThread implements Runnable{
    String thrdName;
    PrintWriter pw = new PrintWriter(System.out, true);
    MyThread(String name){
        thrdName = name;
    }

    public void run(){
        pw.println("The thread " + thrdName + " has started");
        try {
            for(int count =0; count < 10; count++){
                Thread.sleep(400);
                pw.println("Inside " + thrdName + ", counter: " + count);
                pw.flush();
            }
        } catch(InterruptedException ex){
            pw.println(thrdName + "is interrupted");
        }
    }


}

class UseThreads{
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Starting of the main Thread");

        MyThread mt = new MyThread("Child #1");
        Thread newThread = new Thread(mt);

        newThread.start();

        for (int i = 0; i < 50; i++){
            pw.print('.');
            pw.flush();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
