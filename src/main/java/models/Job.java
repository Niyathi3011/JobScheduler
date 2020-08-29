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

    public static int getUserPriority(User user) {
        switch (user) {
            case ROOT:
                return 3;
            case ADMIN:
                return 2;
            case USER:
                return 1;
        }
        return 0;
    }

    public static int priority(Priority priority) {
        switch (priority) {
            case P0:
                return 3;
            case P1:
                return 2;
            case P2:
                return 1;
        }
        return 0;
    }
}
