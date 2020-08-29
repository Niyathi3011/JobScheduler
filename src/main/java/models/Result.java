package models;

import lombok.ToString;

import java.util.*;
@ToString
public class Result {

    private final PriorityQueue<Thread>priorityQueue;

    public Result() {
        priorityQueue = new PriorityQueue<Thread >(new MyComparator());
    }

    public PriorityQueue<Thread> getPriorityQueue() {
        return priorityQueue;
    }
}
