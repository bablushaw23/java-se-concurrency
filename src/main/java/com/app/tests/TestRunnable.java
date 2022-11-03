package com.app.tests;

import com.app.runnables.AppRunnable;

public class TestRunnable {
    public static void main(String[] args) {
        AppRunnable runnable1= new AppRunnable();

        Thread thread1= new Thread(runnable1);
        Thread thread2= new Thread(runnable1);
        Thread thread3= new Thread(runnable1);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
