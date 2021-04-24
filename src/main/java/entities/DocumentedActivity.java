package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DocumentedActivity extends Activity {

    private NormalActivity activity;
    private List<Question> questions;

    public DocumentedActivity(String name, String state, Iteration iteration) throws SabanaResearchException {
        super(name,state,iteration);
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }

    public DocumentedActivity(String name, String state, Iteration iteration, NormalActivity activity) throws SabanaResearchException {
        super(name, state, iteration);
        this.activity = activity;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    @Override
    public Duration getDuration() throws SabanaResearchException {


        if(questions.isEmpty())
                throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_DOCUMENTED_ACTIVITY);
        if(this.activity == null)
                throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_DOCUMENTED_ACTIVITY_WITHOUT_NORMAL_QUESTION);

        Duration d = this.activity.getDuration();
        for (Question q : questions){
            d = d.plus(q.getDedication());
        }

        //duration2 = activity.getDuration();

        return d;
    }
}
