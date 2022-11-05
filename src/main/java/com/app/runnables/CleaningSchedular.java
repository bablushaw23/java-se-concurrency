package com.app.runnables;

import java.io.File;

public class CleaningSchedular implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        File folder=new File("C:\\Users\\bs078474\\OneDrive - Cerner Corporation\\Documents\\learnings\\Java\\linkedin-learning-java-cuncurrency\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\randomJunkToDelete");
        File[] files=folder.listFiles();
        int i=6;
        while(i>=0){
            System.out.println("sleeping for seconds:"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        }
        for(File file: files){      // delete files from dir if older than 5 mins
            System.out.println("Checking file: "+file.getName());
            if(System.currentTimeMillis()-file.lastModified()>1*60*1000){
                System.out.println("Deleting file: "+file.getName());
//                file.delete();
            }
        }
    }
}
