package com.simonas.psp.survey.facade.execution;

import com.simonas.psp.survey.data.dto.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dto.UserSurvey;
import com.simonas.psp.survey.data.entity.Question;
import com.simonas.psp.survey.data.entity.Survey;
import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.facade.ExecutionFacade;
import com.simonas.psp.survey.repository.ExecutionRepository;
import com.simonas.psp.survey.repository.SurveyRepository;
import com.simonas.psp.survey.repository.UserRepository;
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
    public String answer(SurveyQuestionAnswer surveyQuestionAnswer) {
        Optional<User> optionalUser = userRepository.getById(surveyQuestionAnswer.getUserId());
        Optional<Question> optionalQuestion = surveyRepository.getQuestionById(surveyQuestionAnswer.getQuestionId());
        Optional<Survey> optionalSurvey = surveyRepository.getById(surveyQuestionAnswer.getSurveyId());

        if (!optionalUser.isPresent()) {
           return "No such user found";
        }
        if (!optionalQuestion.isPresent()) {
            return "No such question found";
        }
        if (!optionalSurvey.isPresent()) {
            return "No such survey found";
        }

        if (!optionalQuestion.get().getChoices().contains(surveyQuestionAnswer.getAnswer())) {
            return "The answer provided is invalid";
        }


        if (executionRepository.saveUserAnswer(optionalUser.get(),
                                               optionalSurvey.get(),
                                               optionalQuestion.get(),
                                               surveyQuestionAnswer.getAnswer())) {
            return "Your answer was saved";
        }
        return "You have already answered this question";
    }

    @Override
    public String getUserProgress(UserSurvey userSurvey) {
        Optional<User> optionalUser = userRepository.getById(userSurvey.getUserId());
        if (!optionalUser.isPresent()) {
            return "No such user found";
        }
        Optional<Survey> optionalSurvey = surveyRepository.getById(userSurvey.getSurveyId());
        if (!optionalSurvey.isPresent()) {
            return "No such survey found";
        }
        Optional<Map<Survey, Map<Question, String>>> optionalUserAnswers = executionRepository
                                                                    .getUserAnswers(optionalUser.get());
        if (optionalUserAnswers.isPresent()) {
            return optionalUserAnswers.get().values().toString();
        }
        return "User progress is not available at the moment";
    }
}
