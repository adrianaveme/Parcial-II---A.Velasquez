package entities;

import java.time.Duration;
import java.util.List;

public class StudentSynthesizer implements ISynthesizer{

    public List <Student> students;


    @Override
    public Duration synthezise() throws SabanaResearchException {

        Duration d = Duration.ZERO;

        for (Student s : students){
            d=s.getActivitiesDuration();

        }

        return d;

    }
}
