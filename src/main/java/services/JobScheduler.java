package services;

import models.Job;
import models.Result;
import models.Thread;

import java.util.List;
import java.util.PriorityQueue;

public class JobScheduler {

    private final Result result;

    public JobScheduler() {
        result = new Result();
    }

    public Result scheduleThreads(List<Job> jobList) {
        PriorityQueue<Thread> pq = result.getPriorityQueue();
        for (Job job : jobList) {
            Thread thread = pq.peek();
            if (thread != null) {
                thread.addJob(job);
            }
            pq.add(thread);

        }
        return result;
    }

}

