package shiltd.parallelprogs;

/**
 * Created by Developer on 5/15/2017.
 */
public class MyThreadSRS implements Runnable {
    Thread thrd;

    volatile boolean suspended;
    volatile boolean stopped;

    MyThreadSRS(String name){
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName() + " is running");
        try{
            for(int i = 0; i < 1000; i++){
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch (InterruptedException ex){
            System.out.println("Error " + ex);
        }
        System.out.println(thrd.getName() + " is exit");
    }

    synchronized void myStop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mySuspend(){
        suspended = true;
    }

    synchronized void myResume(){
        suspended = false;
        notify();
    }
}

class Suspend{
    public static void main(String[] args) {
        MyThreadSRS ob1 = new MyThreadSRS("My Thread");

        try {
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("The Thread is suspended");
            Thread.sleep(1000);

            ob1.myResume();
            System.out.println("The Thread is resumed");
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("The Thread is suspended");
            Thread.sleep(1000);

            ob1.myResume();
            System.out.println("The Thread is resumed");
            Thread.sleep(1000);

            ob1.mySuspend();
            System.out.println("The Thread is stopped");
            ob1.myStop();

        } catch (InterruptedException ex){
            System.out.println("Error " + ex);
        }

        try{
            ob1.thrd.join();
        } catch (InterruptedException ex) {
            System.out.println("The main Thread is broken " + ex);
        }
    }
}
