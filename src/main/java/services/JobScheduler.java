package services;

import models.Job;
import models.Result;
import models.Thread;

import java.util.List;
import java.util.PriorityQueue;

public class JobScheduler {
    public static void scheduleThreads(List<Job> jobList, Result result) {
        PriorityQueue<Thread> pq = result.getPriorityQueue();
        for (Job job : jobList) {
            Thread thread = pq.peek();
            if (thread != null) {
                thread.addJob(job);
            }
            pq.add(thread);

        }
    }

}

