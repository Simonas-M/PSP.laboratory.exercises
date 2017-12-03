package com.simonas.psp.survey.repository.survey;

import com.simonas.psp.survey.data.entity.Question;
import com.simonas.psp.survey.data.entity.Survey;
import com.simonas.psp.survey.repository.SurveyRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class InMemorySurveyRepository implements SurveyRepository {
    private List<Survey> surveys = new ArrayList<>(Arrays.asList(
        new Survey(
            "Health care Survey",
            new ArrayList<>(Arrays.asList(
                new Question(
                    "How many liters of water is recommended to drink?",
                    new ArrayList<>(Arrays.asList(
                        "0.5l",
                        "1.0l",
                        "1.5l",
                        "2.0l"
                    )),
                    3),
                new Question(
                    "Where is the biggest health-care building in the world?",
                    new ArrayList<>(Arrays.asList(
                        "Mexico",
                        "Minsk",
                        "Lisbon",
                        "In your hearth"
                    )),
                    3)
            ))),
        new Survey(
            "Amazing survey",
            new ArrayList<>(Arrays.asList(
                new Question(
                    "How should you brush your teeth?",
                    new ArrayList<>(Arrays.asList(
                        "Swirling motion",
                        "Back and forth",
                        "Not brush at all"
                    )),
                    2),
                new Question(
                    "Why is this amazing?",
                    new ArrayList<>(Arrays.asList(
                        "It's Java dude",
                        "Spring is awesome",
                        "I don't know",
                        "I have my own reasons"
                    )),
                    1)
            ))),
        new Survey(
            "PC specialist survey",
            new ArrayList<>(Arrays.asList(
                new Question(
                    "Which processor is faster?",
                    new ArrayList<>(Arrays.asList(
                        "Intel i5-3570K",
                        "Intel Atom-3340M",
                        "AMD Ryzen 7-1700K",
                        "AMD Sempron 3000+"
                    )),
                    2),
                new Question(
                    "Why do you need to apply thermal compound onto the processor?",
                    new ArrayList<>(Arrays.asList(
                        "You don't need to",
                        "Because it helps",
                        "The heat dissipates more quickly into the radiator and that helps to cool the processor down",
                        "I don't know"
                    )),
                    2)
            )))
        ));
    @Override
    public List<Survey> getAll() {
        return surveys;
    }

    @Override
    public Optional<Survey> getById(String id) {
        return surveys.stream()
            .filter(survey -> survey.getId().toString().equals(id))
            .findFirst();
    }

    @Override
    public Optional<Question> getQuestionById(String questionId) {
        return surveys.stream()
            .flatMap(survey -> survey.getQuestions().stream())
            .collect(Collectors.toList())
            .stream()
            .filter(question -> question.getId().toString().equals(questionId))
            .findFirst();
    }
}
