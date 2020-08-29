package models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@Getter
@AllArgsConstructor
public class Thread {

    private final List<ScheduledJob>threadList;
    private final String name;

}
