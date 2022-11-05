package com.app.tests;

import com.app.runnables.CleaningSchedular;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestSchedular {
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newSingleThreadScheduledExecutor();
//        service.schedule(new CleaningSchedular(),5, TimeUnit.SECONDS);    // 5 is initial delay
        service.scheduleAtFixedRate(new CleaningSchedular(),5,4,TimeUnit.SECONDS); // runs at every 4 seconds after init delay of 5 secs
//        service.scheduleWithFixedDelay(new CleaningSchedular(),5,4,TimeUnit.SECONDS); // difference from up is, it
        // accounts the time taken by thread to run and delays 4 sec after thread shutdown. But in up, it will run every 4 secs irrespective of termination and
        // if termination takes more than 4 secs then it starts immediately
    }
}
