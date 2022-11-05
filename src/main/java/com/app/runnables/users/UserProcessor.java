package com.app.runnables.users;

import com.app.beans.User;
import com.app.dao.UserDao;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

public class UserProcessor implements Callable<Integer> {

    private String userRecord;
    private UserDao dao;

    public UserProcessor(String userRecord, UserDao dao) {
        this.userRecord = userRecord;
        this.dao = dao;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        StringTokenizer tokenizer= new StringTokenizer(userRecord,",");
        System.out.println(Thread.currentThread().getName()+" processing record for: "+userRecord);
        User user=new User();
        int rows=0;
        Thread.sleep(2000);
        while(tokenizer.hasMoreTokens()){
            user.setEmailAddress(tokenizer.nextToken());
            user.setName(tokenizer.nextToken());
            user.setId(Integer.parseInt(tokenizer.nextToken()));
            rows= dao.saveUser(user);
        }
        return rows;
    }
}
