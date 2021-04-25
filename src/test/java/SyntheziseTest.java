import com.github.javafaker.Faker;
import entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SyntheziseTest {

    private static Faker faker;

    private Project wellFormedProject;

    public SyntheziseTest() {

        faker = new Faker(new Locale("en-US"));
    }

    @BeforeEach
    public void setup() throws SabanaResearchException{

        setupWellFormedProject();
    }
    @Test
    @DisplayName("GIVEN a project without iterations WHEN get duration THEN get SabanaResearchException")
    public void shouldThrowsSabanaResearchExceptionWhenProjectWithoutIterations() throws SabanaResearchException {


    }


    private void setupWellFormedProject() throws SabanaResearchException {

        Group group = new Group(faker.team().name());
        wellFormedProject = new Project(faker.team().name(), LocalDate.now().minusDays(10), LocalDate.now().plusDays(10), group);
        Iteration iteration = new Iteration(faker.team().name(), wellFormedProject);
        List <Iteration> iterations = new ArrayList<>();

        iterations.add(iteration);
        ExecutiveSynthesizer es = new ExecutiveSynthesizer(iterations);

        NormalActivity normalActivity = new NormalActivity(faker.team().name(), Activity.ACTIVE_STATE, iteration);
        normalActivity.addStep(new Step(faker.team().name(), Duration.ofDays(1)));

        NormalActivity activity = new NormalActivity(faker.team().name(), Activity.ACTIVE_STATE, null);
        activity.addStep(new Step(faker.team().name(), Duration.ofDays(1)));
        DocumentedActivity documentedActivity = new DocumentedActivity(faker.team().name(), Activity.ACTIVE_STATE, iteration, activity);
        documentedActivity.addQuestion(new Question(Question.EASY_QUESTION, faker.team().name(), Duration.ofDays(1)));

        System.out.print(es.synthezise());

    }


}
