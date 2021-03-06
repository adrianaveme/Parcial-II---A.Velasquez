package entities;

import java.time.LocalDate;

public class Summary {

    private int activeProjects;
    private LocalDate date;


    public int getActiveProjects() {
        return this.activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }

    public Summary(int activeProjects, LocalDate date) {
        this.activeProjects = activeProjects;
        this.date = date;
    }
}
