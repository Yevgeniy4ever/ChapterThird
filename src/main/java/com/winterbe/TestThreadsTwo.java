package com.winterbe;

import java.util.concurrent.TimeUnit;

/**
 * Created by Developer on 6/27/2017.
 */
public class TestThreadsTwo {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        runnable.run();

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
