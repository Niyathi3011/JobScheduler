package services;

import com.google.common.collect.ComparisonChain;
import models.Job;
import models.Result;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static models.Job.getUserPriority;
import static models.Job.priority;
import static services.JobScheduler.scheduleThreads;

public class FixedPriorityScheduling extends Service {

    public FixedPriorityScheduling(List<Job> jobList) {
        super(jobList);
    }

    @Override
    public Result execute() {

        Collections.sort(getJobList(), new Comparator<Job>() {
            @Override
            public int compare(Job job1, Job job2) {
                ComparisonChain.start()
                        .compare(priority(job2.getPriority()), priority(job1.getPriority()))
                        .compare(getUserPriority(job2.getUser()), getUserPriority(job1.getUser()))
                        .compare(job2.getDuration(), job1.getDuration())
                        .result();
                return 0;
            }
        });

        scheduleThreads(getJobList(),getResult());
        return getResult();
    }
}
