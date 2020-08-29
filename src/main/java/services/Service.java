package services;

import models.Job;
import models.Result;

import java.util.List;

public abstract class Service {

    private final List<Job> jobList;
    private final JobScheduler jobScheduler;

    public Service(List<Job> jobList) {
        this.jobList = jobList;
        this.jobScheduler = new JobScheduler();

    }

    public List<Job> getJobList() {
        return jobList;
    }

    public JobScheduler getJobScheduler() {
        return jobScheduler;
    }

    abstract public Result execute();
}
