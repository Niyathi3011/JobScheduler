package factory;

import models.Job;
import models.Result;
import services.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class System {

    private final List<Job> jobList;
    private final Map<ServiceType, Result> resultMap;
    private final ServiceFactory serviceFactory;

    public System(List<Job> jobList) {
        this.jobList = jobList;
        this.resultMap = new HashMap<>();
        serviceFactory = new ServiceFactory(jobList);
    }

    public Map<ServiceType, Result> getResultMap() {
        return resultMap;
    }

    public void executeJobScheduling() {

        for (ServiceType serviceType : ServiceType.values()) {

            Service service = serviceFactory.getService(serviceType);
            resultMap.put(serviceType, service.execute());

        }
    }


}
