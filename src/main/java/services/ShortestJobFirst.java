package services;

import models.Job;
import models.Result;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShortestJobFirst extends Service {

    public ShortestJobFirst(List<Job> jobList) {
        super(jobList);
    }

    @Override
    public Result execute() {
        return null;
    }
}
