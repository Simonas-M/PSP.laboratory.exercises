package com.simonas.psp.survey.repository.execution;

import com.simonas.psp.survey.data.entity.Question;
import com.simonas.psp.survey.data.entity.Survey;
import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.repository.ExecutionRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class RepeatedExecutionRepository implements ExecutionRepository {
    private Map<User, Map<Survey, Map<Question, String>>> usersAnswers = new HashMap<>();

    @Override
    public boolean saveUserAnswer(User user, Survey survey, Question question, String answer) {
        Map<Question, String> userAnswers = createAndOrGetUserSurveyAnswers(user, survey);

        if(!userAnswers.containsKey(question)) {
            userAnswers.put(question, answer);
        } else {
            userAnswers.remove(question);
            userAnswers.put(question, answer);
        }
        return true;
    }

    @Override
    public Optional<Map<Survey, Map<Question, String>>> getUserAnswers(User user) {
        if(usersAnswers.containsKey(user)) {
            return Optional.of(usersAnswers.get(user));
        }
        return Optional.empty();
    }

    @Override
    public void clearUserAnswers(User user) {
        getUserAnswers(user).ifPresent(Map::clear);
    }

    private Map<Question, String> createAndOrGetUserSurveyAnswers(User user, Survey survey) {
        if (!usersAnswers.containsKey(user)) {
            usersAnswers.put(user, new HashMap<>());
        }
        if (!usersAnswers.get(user).containsKey(survey)) {
            usersAnswers.put(user, new HashMap<>());
        }
        return usersAnswers.get(user).get(survey);
    }
}
