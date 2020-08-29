package models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ScheduledJob {

    private final String name;
    private final int startTime;
    private final int endTime;


}
