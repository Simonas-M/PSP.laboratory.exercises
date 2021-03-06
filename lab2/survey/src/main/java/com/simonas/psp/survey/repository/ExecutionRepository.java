package com.simonas.psp.survey.repository;

import com.simonas.psp.survey.data.entity.Question;
import com.simonas.psp.survey.data.entity.Survey;
import com.simonas.psp.survey.data.entity.User;

import java.util.Map;
import java.util.Optional;

public interface ExecutionRepository {
    boolean saveUserAnswer(User user, Survey survey, Question question, String answer);

    Optional<Map<Survey, Map<Question, String>>> getUserAnswers(User user);

    void clearUserAnswers(User user);
}
