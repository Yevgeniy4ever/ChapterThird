package com.winterbe;

/**
 * Created by Developer on 6/26/2017.
 */
public class TestThreads {
    public static void main(String[] args) {
        //System.out.println("Hello " + Thread.currentThread().getName());


        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }
}
