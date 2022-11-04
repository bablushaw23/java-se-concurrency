package com.app.tests;

import com.app.runnables.AppRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TestExecutor {
    public static void main(String[] args) {
        AppRunnable runnable= new AppRunnable();
//        Executor executor= Executors.newSingleThreadExecutor();     // this will return a thread
//        executor.execute(runnable);
//        executor.execute(runnable);     // same executor over same object, so runs synchronously. Thread name: pool-1-thread-1

        AppRunnable run1= new AppRunnable();
        AppRunnable run2= new AppRunnable();
        Executor executor1= Executors.newSingleThreadExecutor();    // pool-1-thread-1
        Executor executor2=Executors.newSingleThreadExecutor();    // pool-2-thread-1
        executor1.execute(run1);
        executor2.execute(run2);
    }
}
