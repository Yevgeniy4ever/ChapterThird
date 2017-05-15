package shiltd.mythreads;

/**
 * Created by Yevgeniy on 13.05.2017.
 */
public class MyThrdAlive implements Runnable{
    Thread thrd;

    MyThrdAlive(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        for(int count = 0; count < 10; count ++){
            System.out.println(thrd.getName() + " count is " + count);
            try{
                Thread.sleep(400);
            } catch (InterruptedException ex){
                System.out.println("Error is " + ex);
            }
        }
    }
}

class MyThrdStart{
    public static void main(String[] args) {
        MyThrdAlive thrdOnj1 = new MyThrdAlive("Child #1");
        MyThrdAlive thrdOnj2 = new MyThrdAlive("Child #2");
        MyThrdAlive thrdOnj3 = new MyThrdAlive("Child #3");

        System.out.println("Main thread was started");
        do {
                System.out.print(".");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    System.out.println("Error " + ex);

            }
        } while (thrdOnj1.thrd.isAlive() || thrdOnj2.thrd.isAlive() || thrdOnj3.thrd.isAlive());
        System.out.println("The main thread is finished");
    }
}