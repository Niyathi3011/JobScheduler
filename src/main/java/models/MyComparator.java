package models;

import java.util.Comparator;

public class MyComparator implements Comparator<Thread> {
    @Override
    public int compare(Thread thread, Thread t1) {
        if(thread.getScheduledTime()<=t1.getScheduledTime())
            return 1;
        else
            return -1;
    }
}
