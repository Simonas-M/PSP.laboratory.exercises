package com.simonas.psp.survey.repositories.survey;

import com.simonas.psp.survey.data.entities.Question;
import com.simonas.psp.survey.data.entities.Survey;
import com.simonas.psp.survey.repositories.SurveyRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

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
    public Survey getById(String id) {
        return defaultSurvey;
    }
}
