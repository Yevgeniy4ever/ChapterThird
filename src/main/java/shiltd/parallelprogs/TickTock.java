package shiltd.parallelprogs;

/**
 * Created by Yevgeniy on 14.05.2017.
 */
public class TickTock {

    String state;

    synchronized void tick(boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");

        state = "ticked";

        notify();
        try {
            while (!state.equals("tocked"))
                wait();
        } catch (InterruptedException ex){
            System.out.println("Thread was broken");
        }
    }

    synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock ");

        state = "tocked";

        notify();
        try {
            while (!state.equals("ticked"))
                wait();
        } catch (InterruptedException ex) {
            System.out.println("Thread was broken");
        }
    }

}

class MyThread implements Runnable{
    Thread thrd;
    TickTock ttOb;

    MyThread(String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }

    public void run(){
        if(thrd.getName().compareTo("Tick") == 0 ) {
            for(int i = 0; i < 5; i ++) ttOb.tick(true);
                ttOb.tick(false);

        }
        else {
            for (int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}


class TickTockStart{
    public static void main(String[] args) {

        TickTock ttOb = new TickTock();
        MyThread thrdOb1 = new MyThread("Tick", ttOb);
        MyThread thrdOb2 = new MyThread("Tock", ttOb);

        try{
            thrdOb1.thrd.join();
            thrdOb2.thrd.join();
        } catch (InterruptedException ex){
            System.out.println(ex);
        }
    }
}
