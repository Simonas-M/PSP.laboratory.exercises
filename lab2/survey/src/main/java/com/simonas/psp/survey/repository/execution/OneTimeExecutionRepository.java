package com.simonas.psp.survey.repository.execution;

import com.simonas.psp.survey.data.entity.Question;
import com.simonas.psp.survey.data.entity.Survey;
import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.repository.ExecutionRepository;

import java.util.HashMap;
import java.util.Map;

public class OneTimeExecutionRepository implements ExecutionRepository {
    private Map<User, Map<Survey, Map<Question, String>>> usersAnswers = new HashMap<>();

    @Override
    public boolean saveUserAnswer(User user, Survey survey, Question question, String answer) {
        Map<Question, String> userAnswers = createAndOrGetUserSurveyAnswers(user, survey);

        if(!userAnswers.containsKey(question)) {
            userAnswers.put(question, answer);
            return true;
        }
        return false;
    }

    @Override
    public Map<Survey, Map<Question, String>> getUserAnswers(User user) {
        return usersAnswers.get(user);
    }

    @Override
    public void clearUserAnswers(User user) {
        usersAnswers.get(user).clear();
    }

    private Map<Question, String> createAndOrGetUserSurveyAnswers(User user, Survey survey) {
        if (!usersAnswers.containsKey(user)) {
            usersAnswers.put(user, new HashMap<>());
        }
        if (!usersAnswers.get(user).containsKey(survey)) {
            usersAnswers.get(user).put(survey, new HashMap<>());
        }
        return usersAnswers.get(user).get(survey);
    }
}
