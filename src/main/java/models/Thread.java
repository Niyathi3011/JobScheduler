package models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
@AllArgsConstructor
public class Thread {

    private final List<String>scheduledJobList;
    private final int id;
    private int scheduledTime;

    public Thread(int id) {
        this.id = id;
        this.scheduledJobList=new ArrayList<>();
        scheduledTime=0;
    }

    public void addJob(Job job){
        this.scheduledJobList.add(job.getName());
        this.scheduledTime+=job.getDuration();
    }


}
