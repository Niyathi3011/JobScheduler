package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    private final List<Thread> threadList;

    public List<Thread> getThreadList() {
        return threadList;
    }

    public Result() {
        this.threadList=new ArrayList<>();
    }

    public void addThread(Thread thread){
        this.threadList.add(thread);
    }

    public Thread getThread(int i){
        return this.threadList.get(i);
    }

}
