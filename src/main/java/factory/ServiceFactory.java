package factory;

import models.Job;
import services.*;

import java.util.List;

public class ServiceFactory {

    private final List<Job> jobList;

    public ServiceFactory(List<Job> jobList) {
        this.jobList = jobList;
    }

    public Service getService(ServiceType service) {
        switch (service) {
            case SJF:
                return new ShortestJobFirst(jobList);
            case EDF:
                return new EarliestDeadlineFirst(jobList);
            case FPS:
                return new FixedPriorityScheduling(jobList);
            case FCFS:
                return new FirstComeFirstServe(jobList);
        }

        return null;
    }
}
