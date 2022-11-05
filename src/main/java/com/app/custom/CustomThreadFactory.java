package com.app.custom;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    /**
     * Constructs a new {@code Thread}.  Implementations may also initialize
     * priority, name, daemon status, {@code ThreadGroup}, etc.
     *
     * @param r a runnable to be executed by new thread instance
     * @return constructed thread, or {@code null} if the request to
     * create a thread is rejected
     */
    private static int i=0;
    @Override
    public Thread newThread(Runnable r) {
        Thread thread= new Thread(r);
        thread.setName("Custom-"+i++);
        return thread;
    }
}
