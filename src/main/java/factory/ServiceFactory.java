package factory;

import models.Job;
import models.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceFactory {

    private final List<Job>jobList;
    private final Map<Service, Result> resultMap;

    public ServiceFactory(List<Job> jobList) {
        this.jobList = jobList;
        this.resultMap=new HashMap<>();
    }

    public Map<Service, Result> getResultMap() {
        return resultMap;
    }
    Service service[]=Service.values();



}
