package services;

import com.google.common.collect.ComparisonChain;
import models.Job;
import models.Result;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static data.JobSchedulerData.NUMBER_OF_THREADS;
import static models.Job.priority;

public class ShortestJobFirst extends Service {

    public ShortestJobFirst(List<Job> jobList) {
        super(jobList);
    }

    @Override
    public Result execute() {

        Collections.sort(getJobList(), new Comparator<Job>() {
            @Override
            public int compare(Job job1, Job job2) {
                ComparisonChain.start()
                        .compare(job1.getDuration(), job2.getDuration())
                        .compare(priority(job2.getPriority()), priority(job1.getPriority()))
                        .result();

                return 0;
            }
        });


        return scheduleThreads(getJobList());

    }

    public Result scheduleThreads(List<Job> jobList) {

        int i=1;
        for (Job job : jobList) {
            while (i <= NUMBER_OF_THREADS) {
                if (getResult().getThread(i).getScheduledTime() < job.getDeadline()) {
                    getResult().getThread(i).addJob(job);
                    i++;
                    break;
                }
                i++;
            }
            if (i >= NUMBER_OF_THREADS)
                i = 1;
        }

        return getResult();
    }


}

