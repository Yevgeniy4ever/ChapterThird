package com.winterbe;

import java.util.concurrent.*;

/**
 * Created by Developer on 6/27/2017.
 */
public class JavaExecutor {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
    }
}
