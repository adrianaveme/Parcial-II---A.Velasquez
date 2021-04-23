package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private Project project;
    private List<Activity> activities;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    public int countOpenActivities() {
        int count =0;

        for(Activity a: this.activities){
            if(a.isActive()){
                count++;
            }
        }

        /*for (int i = 0; i< this.activities.size(); i++){
            if(this.activities.get(i).isActive()){
                count++;
            }
        }*/

        //Counts number of activities. Map converts activity into boolean.
        //filter function is also used. Se hace un flujo de actividades luego un mapa un filtro y una cuenta

        return (int) this.activities.stream()
                .map(activity -> activity.isActive())
                .filter(b -> b)
                .count();
        //return count;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public Duration getDuration() throws SabanaResearchException {

        Duration d = Duration.ZERO;
        if (this.activities.isEmpty())
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_ITERATION);

        for (Activity a : this.activities){
            d=d.plus(a.getDuration());
        }

        return d;
    }
}
