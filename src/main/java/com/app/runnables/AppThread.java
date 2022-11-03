package com.app.runnables;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AppThread extends Thread{

    @Override
    public void run() {
        try(BufferedReader reader= new BufferedReader(new FileReader(new File("C:\\Users\\bs078474\\OneDrive - Cerner Corporation\\Documents\\learnings\\Java\\linkedin-learning-java-cuncurrency\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\02_03\\begin\\sample.txt")))){
            String line=null;
            while((line= reader.readLine())!=null){
                System.out.println(Thread.currentThread().getName()+" reading the line: "+ line);
            }
        }catch (Exception ignored){

        }
    }
}
