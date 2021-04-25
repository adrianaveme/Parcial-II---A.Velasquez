package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ExecutiveSynthesizer implements ISynthesizer{

    public List <Iteration> iterations;
    public ArrayList <String> resume;

    public ExecutiveSynthesizer(List<Iteration> iterations) {
        this.iterations = iterations;
    }

    @Override
    public List <String> synthezise() throws SabanaResearchException {

        String obj = null;

        resume = new ArrayList<>();

        if (this.iterations.isEmpty())
            throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_PROJECT);

        Duration d = Duration.ZERO;

        for (Iteration i : this.iterations){
            d=i.getDuration();
            obj = i.getObjective();
            resume.add("Objetivo: "+obj);
        }

        return resume;

    }
}
