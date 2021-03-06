package com.simonas.psp.survey.repository.survey;

import com.simonas.psp.survey.data.entity.Question;
import com.simonas.psp.survey.data.entity.Survey;
import com.simonas.psp.survey.repository.SurveyRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@Component
public class MockedSurveyRepository implements SurveyRepository {

    private Survey defaultSurvey = new Survey(
        "SurveyTitle",
        new ArrayList<>(Arrays.asList(
            new Question(
                "1st Question Title",
                new ArrayList<>(Arrays.asList(
                    "answer 1",
                    "answer 2",
                    "answer 3",
                    "answer 4"
                )),
                2),
            new Question(
                "2nd Question Title",
                new ArrayList<>(Arrays.asList(
                    "answer 1",
                    "answer 2",
                    "answer 3",
                    "answer 4"
                )),
                1)
        )));

    private ArrayList<Survey> defaultSurveyList = new ArrayList<>(Arrays.asList(
        defaultSurvey,
        new Survey(
            "Second Survey Title",
            new ArrayList<>(Arrays.asList(
                new Question(
                    "1st Question Title",
                    new ArrayList<>(Arrays.asList(
                        "answer 1",
                        "answer 2",
                        "answer 3",
                        "answer 4"
                    )),
                    1),
                new Question(
                    "2nd Question Title",
                    new ArrayList<>(Arrays.asList(
                        "answer 1",
                        "answer 2",
                        "answer 3",
                        "answer 4"
                    )),
                    2)
            )))
    ));

    @Override
    public ArrayList<Survey> getAll() {
        return defaultSurveyList;
    }

    @Override
    public Optional<Survey> getById(String id) {
        return Optional.of(defaultSurvey);
    }

    @Override
    public Optional<Question> getQuestionById(String questionId) {
        return Optional.of(defaultSurvey.getQuestions().get(0));
    }
}
