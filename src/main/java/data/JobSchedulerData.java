package data;

import models.Job;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class JobSchedulerData {

    public static int NUMBER_OF_THREADS;
    public static List<Job> jobList;
    private static final int NUMBER_OF_FIELDS = 5;

    public JobSchedulerData() {
        jobList = new ArrayList<>();
    }

    public static List<Job> getInputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Thraeds");
        NUMBER_OF_THREADS = sc.nextInt();
        String s = "Yes";
        while (s.matches("Yes")) {
            String job;
            System.out.println("Enter the job");
            job = sc.nextLine();
            jobList.add(getJobOrder(job));
            System.out.println("Yes/No");
            s = sc.nextLine();

        }
        return jobList;
    }

    private static Job getJobOrder(String data) {

        String[] fields = data.split(" ");
        if (fields.length != NUMBER_OF_FIELDS) {
            System.out.println("Wrong number of fields");
        }

        String name = fields[0];
        int duration = parseInt(fields[1]);
        Job.Priority priority = Job.Priority.valueOf(fields[2]);
        int deadline = parseInt(fields[3]);
        Job.User user = Job.User.valueOf(fields[4].toUpperCase());
        return new Job(name, duration, priority, deadline, user);
    }
}

