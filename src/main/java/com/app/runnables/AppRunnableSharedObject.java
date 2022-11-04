package com.app.runnables;

public class AppRunnableSharedObject implements Runnable {
    private int inc=0;

    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        if(threadName.contains("0")||threadName.contains("2")||threadName.contains("4")||threadName.contains("6")||threadName.contains("8")){
            inc++;
            System.out.println(threadName+": value increased");
        }
        else{
            System.out.println(threadName+ ": value: "+inc);
        }
    }
}
