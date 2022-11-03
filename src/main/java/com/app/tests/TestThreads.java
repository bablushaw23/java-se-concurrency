package com.app.tests;

import com.app.runnables.AppThread;

public class TestThreads {
    public static void main(String[] args) {
        AppThread thread1= new AppThread();     // creating 3 threads
        AppThread thread2= new AppThread();
        AppThread thread3= new AppThread();

        thread1.start();        // start method calls run in seperate thread
        thread2.start();
        thread3.start();
    }
}
