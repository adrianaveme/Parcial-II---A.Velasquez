package entities;

import java.time.Duration;
import java.util.List;

public class ExecutiveSynthesizer implements ISynthesizer{

    public List <Iteration> iterations;
    @Override
    public Duration synthezise() throws SabanaResearchException {

        Duration d = Duration.ZERO;
        String obj = null;

        for (Iteration i : iterations){
            d=i.getDuration();
            obj = i.getObjective();
        }

        return d;

    }
}
