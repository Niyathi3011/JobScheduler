package models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Job {
    private final String name;
    private final int duration;
    private final Priority priority;
    private final int deadline;
    private final User user;

    public enum Priority {
        P0, P1, P2

    }

    public enum User {
        ROOT, ADMIN, USER
    }

}
