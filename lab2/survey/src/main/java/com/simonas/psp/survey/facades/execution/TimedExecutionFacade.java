package com.simonas.psp.survey.facades.execution;

import com.simonas.psp.survey.data.dtos.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dtos.UserSurvey;
import com.simonas.psp.survey.data.entities.Question;
import com.simonas.psp.survey.facades.ExecutionFacade;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TimedExecutionFacade implements ExecutionFacade {

    @Override
    public String answer(String userId, String surveyId, String questionId, String answer) {
        return null;
    }

    @Override
    public String answer(SurveyQuestionAnswer surveyQuestionAnswer) {
        return null;
    }

    @Override
    public String getUserProgress(String userId, String surveyId) {
        return null;
    }

    @Override
    public String getUserProgress(UserSurvey userSurvey) {
        return null;
    }
}
