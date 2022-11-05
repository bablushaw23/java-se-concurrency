package com.app.tests.users;

import com.app.dao.UserDao;
import com.app.runnables.users.UserProcessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestExecutors {
    public static void main(String[] args) throws Exception {
        List<String> contents=getUserFromFile("C:\\Users\\bs078474\\OneDrive - Cerner Corporation\\Documents\\learnings\\Java\\linkedin-learning-java-cuncurrency\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter3\\03_04\\begin\\new_users.txt");
//        ExecutorService service= Executors.newSingleThreadExecutor();
        ExecutorService service= Executors.newCachedThreadPool();
        UserDao dao= new UserDao();
        for(String user: contents){
          Future<Integer> future= service.submit(new UserProcessor(user, dao));
//          future.cancel(false);
//            UserProcessor processor= new UserProcessor(user,dao);
//            int result= processor.call();
            System.out.println("Result of operation: "+future.get(1, TimeUnit.SECONDS));
        }
        service.shutdown();     // shutdown the service
        System.out.println("Main execution over");
    }

    public static List<String> getUserFromFile(String filename){
        List<String> lines=new ArrayList<>();
        try(BufferedReader reader= new BufferedReader(new FileReader(new File(filename)))){
            String line=null;
            while(( line= reader.readLine())!=null){
                lines.add(line);
            }
        }catch (Exception ignored){

        }
        return lines;
    }
}
