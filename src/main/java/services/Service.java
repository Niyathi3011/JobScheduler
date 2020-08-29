package services;

import models.Job;
import models.Result;

import java.util.List;

public abstract class Service {

    private final List<Job> jobList;

    public Result getResult() {
        return result;
    }
    private final Result result;
    public Service(List<Job> jobList) {
        this.jobList = jobList;
        result = new Result();
    }
    public List<Job> getJobList() {
        return jobList;
    }
    abstract public Result execute();
}
