package entities;

import java.time.Duration;
import java.util.List;

public class ExecutiveSynthesizer implements ISynthesizer{

    public List <Iteration> iterations;
    @Override
    public Duration synthezise() throws SabanaResearchException {

        Duration d = Duration.ZERO;

        for (Iteration i : iterations){
            d=d.plus(i.getDuration());
        }

        return d;

    }
}
