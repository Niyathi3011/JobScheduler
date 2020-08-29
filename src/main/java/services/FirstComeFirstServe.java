package services;

import data.JobSchedulerData;
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

        return getJobScheduler().scheduleThreads(getJobList());
    }

}
