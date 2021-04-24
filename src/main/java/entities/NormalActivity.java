package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NormalActivity extends Activity {

    private List<Step> steps;

    @Override
    public boolean isActive() {
        return super.isActive();
    }

    public NormalActivity(String name, String state, Iteration iteration) throws SabanaResearchException {
        super(name, state, iteration);
        this.steps = new ArrayList<>();
    }

    public void addStep(Step step)   {
        this.steps.add(step);
    }

    @Override
    public Duration getDuration() throws SabanaResearchException{

        Duration d =Duration.ZERO;

        if (steps.isEmpty())
                throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_NORMAL_ACTIVITY);

        for ( Step s : steps){
            d = d.plus(s.getDuration());
        }
        return d;
    }
}
