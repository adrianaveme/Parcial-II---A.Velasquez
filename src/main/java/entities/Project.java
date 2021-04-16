package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private Group group;
    private List<Iteration> iterations;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }
    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Duration getDuration() throws SabanaResearchException {
        return Duration.ofDays(0);
    }

    //////////////////


    public boolean isActive() {
        boolean isActive = true;

        if(LocalDate.now().isAfter(this.dateEnd)){
            isActive = false;
        }
        else{
            int openActivities = this.countOpenActivities();
            isActive = openActivities > 0;
        }

        return isActive;
    }



    public int countOpenActivities(){
        /*int count =0;
        for (Iteration i : this.iterations ){
            count += i.countOpenActivities();
        }
        return count;*/

        //Declara variable inicial cero y a y b
        //se  aplica a + b, se va reduciendo ese resultado en variable inicial 0

        return this.iterations
                .stream()
                .map(i -> i.countOpenActivities())
                .reduce(0, (a, b) -> a+b);
    }


}
