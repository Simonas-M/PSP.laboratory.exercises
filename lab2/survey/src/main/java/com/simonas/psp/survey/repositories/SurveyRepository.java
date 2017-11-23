package com.simonas.psp.survey.repositories;

import com.simonas.psp.survey.data.entities.Question;
import com.simonas.psp.survey.data.entities.Survey;

import java.util.List;
import java.util.Optional;

public interface SurveyRepository {
    List<Survey> getAll();

    Optional<Survey> getById(String id);

    Optional<Question> getQuestionById(String questionId);
}
