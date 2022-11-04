package com.app.tests;

import com.app.runnables.AppRunnableSharedObject;

public class TestRunnableCommonObject {
    public static void main(String[] args) {
        AppRunnableSharedObject obj= new AppRunnableSharedObject();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);
        Thread t4=new Thread(obj);
        Thread t5=new Thread(obj);
        Thread t6=new Thread(obj);
        Thread t7=new Thread(obj);
        Thread t8=new Thread(obj);
        Thread t9=new Thread(obj);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

        // output shows value increased, proves same object sharing
    }
}
