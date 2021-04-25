import com.github.javafaker.Faker;
import entities.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class SynthesizeTest {


    private Project project64;
    private Group friends;
    public List <Student> students;
    public List <Iteration> iterations;
    public List <Question> questions;

    @BeforeEach
    public void setup() throws SabanaResearchException{

        Group friends = new Group("Nintendo");
        Project project64 = new Project("Mario", LocalDate.now().minusDays(10), LocalDate.now().plusDays(10), friends);

        StudentSynthesizer ss = new StudentSynthesizer();
        ExecutiveSynthesizer es = new ExecutiveSynthesizer(iterations);

        this.students = new ArrayList<>();
        this.questions = new ArrayList<>();
        this.iterations = new ArrayList<>();

        Iteration i1 = new Iteration("Defeat villians", project64);
        Iteration i2 = new Iteration("Win medals", project64);

        iterations.add(i1);
        iterations.add(i2);

        DocumentedActivity a1 = new DocumentedActivity("Investiga", Activity.ACTIVE_STATE, i1);
        DocumentedActivity a2 = new DocumentedActivity("Investiga", Activity.ACTIVE_STATE, i2);


        Question q1 = new Question(Question.EASY_QUESTION, "dd", Duration.ofDays(1));
        a2.addQuestion(q1);
        a1.addQuestion(new Question(Question.EASY_QUESTION, "dd", Duration.ofDays(1)));

        NormalActivity activity = new NormalActivity("Laugh", Activity.ACTIVE_STATE, null);

    }
    @Test
    @DisplayName("GIVEN a project without iterations WHEN get duration THEN get SabanaResearchException")
    public void shouldThrowsSabanaResearchExceptionWhenProjectWithoutIterations() throws SabanaResearchException {


        ExecutiveSynthesizer es = new ExecutiveSynthesizer(iterations);
        assertEquals(es.synthezise(), 4);
    }


}
