package services;

import models.Job;
import models.Result;

import java.util.List;

public class FixedPriorityScheduling extends Service {

    public FixedPriorityScheduling(List<Job> jobList) {
        super(jobList);
    }

    @Override
    public Result execute() {
        return null;
    }
}
