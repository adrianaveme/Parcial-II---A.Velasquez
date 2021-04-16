package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DocumentedActivity extends Activity {

    private NormalActivity activity;
    private List<Question> questions;

    public DocumentedActivity(String name, String state, Iteration iteration, NormalActivity activity) {
        super(name, state, iteration);
        this.activity = activity;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    @Override
    public Duration getDuration() {

        Duration duration = null;

        if(questions.isEmpty())
            try {
                throw new SabanaResearchException(SabanaResearchException.BAD_FORMED_DOCUMENTED_ACTIVITY);
            } catch (SabanaResearchException e) {
                e.printStackTrace();
            }

        for (Question q : questions){
            duration = q.getDedication();
        }

        return duration;
    }
}
