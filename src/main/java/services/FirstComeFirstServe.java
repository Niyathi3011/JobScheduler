package services;

import models.Job;
import models.Result;

import java.util.List;

public class FirstComeFirstServe extends Service {

    public FirstComeFirstServe(List<Job> jobList) {
        super(jobList);
    }

    @Override
    public Result execute() {
        return null;
    }
}
