package com.simonas.psp.survey.repository;

import com.simonas.psp.survey.data.entity.Question;
import com.simonas.psp.survey.data.entity.Survey;

import java.util.List;
import java.util.Optional;

public interface SurveyRepository {
    List<Survey> getAll();

    Optional<Survey> getById(String id);

    Optional<Question> getQuestionById(String questionId);
}
