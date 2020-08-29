import data.JobSchedulerData;
import factory.Service;
import factory.ServiceFactory;
import models.Job;
import models.Result;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JobSchedulerApp {

    public static void main(String[] args) {

        JobSchedulerData jobSchedulerData=new JobSchedulerData();
        List<Job> jobList=jobSchedulerData.getInputData();
        ServiceFactory serviceFactory=new ServiceFactory(jobList);
        message(serviceFactory.getResultMap());
    }

    public static void message(Map<Service, Result>result){

        for(Map.Entry map: result.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue().toString());
        }

    }
}
