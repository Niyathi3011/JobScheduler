import data.JobSchedulerData;
import factory.ServiceType;
import factory.System;
import models.Job;
import models.Result;

import java.util.List;
import java.util.Map;


public class JobSchedulerApp {

    public static void main(String[] args) {

        JobSchedulerData jobSchedulerData = new JobSchedulerData();
        List<Job> jobList = jobSchedulerData.getInputData();
        System system = new System(jobList);
        system.executeJobScheduling();
        message(system.getResultMap());
    }

    public static void message(Map<ServiceType, Result> result) {

        result.forEach((key, value) -> {
            java.lang.System.out.println(key);
            java.lang.System.out.println(value.toString());
        });

    }
}
