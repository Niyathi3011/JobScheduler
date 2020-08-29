package services;

import models.Job;
import models.Result;

import java.util.List;

import static data.JobSchedulerData.NUMBER_OF_THREADS;

public class FirstComeFirstServe extends Service {

    public FirstComeFirstServe(List<Job> jobList) {
        super(jobList);
    }

    @Override
    public Result execute() {

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
            if (i > NUMBER_OF_THREADS)
                i = 1;
        }

        return getResult();
    }

}
