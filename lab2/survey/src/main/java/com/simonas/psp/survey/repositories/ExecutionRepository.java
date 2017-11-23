package com.simonas.psp.survey.repositories;

import com.simonas.psp.survey.data.entities.Question;
import com.simonas.psp.survey.data.entities.Survey;
import com.simonas.psp.survey.data.entities.User;

import java.util.Map;

public interface ExecutionRepository {
    boolean saveUserAnswer(User user, Survey survey, Question question, String answer);

    Map<Survey, Map<Question, String>> getUserAnswers(User user);

    void clearUserAnswers(User user);
}
