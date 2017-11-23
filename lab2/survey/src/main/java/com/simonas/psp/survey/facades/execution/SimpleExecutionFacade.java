package com.simonas.psp.survey.facades.execution;

import com.simonas.psp.survey.data.dtos.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dtos.UserSurvey;
import com.simonas.psp.survey.data.entities.Question;
import com.simonas.psp.survey.data.entities.Survey;
import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.facades.ExecutionFacade;
import com.simonas.psp.survey.repositories.ExecutionRepository;
import com.simonas.psp.survey.repositories.SurveyRepository;
import com.simonas.psp.survey.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
public class SimpleExecutionFacade implements ExecutionFacade {
    private ExecutionRepository executionRepository;
    private SurveyRepository surveyRepository;
    private UserRepository userRepository;

    public SimpleExecutionFacade(ExecutionRepository executionRepository,
                                 SurveyRepository surveyRepository,
                                 UserRepository userRepository) {
        this.executionRepository = executionRepository;
        this.surveyRepository = surveyRepository;
        this.userRepository = userRepository;
    }

    @Override
    public String answer(String userId, String surveyId, String questionId, String answer) {
        Optional<User> optionalUser = userRepository.getById(userId);
        if (!optionalUser.isPresent()) {
           return "No such user found";
        }
        Optional<Question> optionalQuestion = surveyRepository.getQuestionById(questionId);
        if (!optionalQuestion.isPresent()) {
            return "No such question found";
        }
        Optional<Survey> optionalSurvey = surveyRepository.getById(surveyId);
        if (!optionalSurvey.isPresent()) {
            return "No such survey found";
        }

        if (!optionalQuestion.get().getChoices().contains(answer)) {
            return "The answer provided is invalid";
        }
        if (executionRepository.saveUserAnswer(optionalUser.get(),
                                               optionalSurvey.get(),
                                               optionalQuestion.get(),
                                               answer)) {
            return "Your answer was saved";
        }
        return "You have already answered this question";
    }

    @Override
    public String answer(SurveyQuestionAnswer surveyQuestionAnswer) {
        return answer(
            surveyQuestionAnswer.getUserId(),
            surveyQuestionAnswer.getSurveyId(),
            surveyQuestionAnswer.getQuestionId(),
            surveyQuestionAnswer.getAnswer()
        );
    }

    @Override
    public String getUserProgress(String userId, String surveyId) {
        Optional<User> optionalUser = userRepository.getById(userId);
        if (!optionalUser.isPresent()) {
            return "No such user found";
        }
        Optional<Survey> optionalSurvey = surveyRepository.getById(surveyId);
        if (!optionalSurvey.isPresent()) {
            return "No such survey found";
        }
        return executionRepository.getUserAnswers(optionalUser.get()).values().toString();
    }

    @Override
    public String getUserProgress(UserSurvey userSurvey) {
        return getUserProgress(userSurvey.getUserId(), userSurvey.getSurveyId());
    }
}
