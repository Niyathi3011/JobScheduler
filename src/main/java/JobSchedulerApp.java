import data.JobSchedulerData;
import factory.Service;
import factory.ServiceFactory;
import models.Job;
import models.Result;
import java.util.List;
import java.util.Map;


public class JobSchedulerApp {

    public static void main(String[] args) {

        JobSchedulerData jobSchedulerData=new JobSchedulerData();
        List<Job> jobList=jobSchedulerData.getInputData();
        ServiceFactory serviceFactory=new ServiceFactory(jobList);
        message(serviceFactory.getResultMap());
    }

    public static void message(Map<Service, Result>result){

        result.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value.toString());
        });

    }
}
