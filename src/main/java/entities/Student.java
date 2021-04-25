package entities;

import java.time.Duration;
import java.util.List;

public class Student {
    private int code;
    private String name;
    private String lastName;
    private String email;
    private Course approved;
    private List <Activity> assignedActivities;

    public Student(String name, List<Activity> assignedActivities) {
        this.name = name;
        this.assignedActivities = assignedActivities;
    }

    public Duration getActivitiesDuration() throws SabanaResearchException {

        Duration d = Duration.ZERO;

        for (Activity a: assignedActivities){
            d = d.plus(a.getDuration());
        }

        return d;
    }

    public String getName() {
        return this.name;
    }
}
