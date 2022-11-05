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
    }
}
