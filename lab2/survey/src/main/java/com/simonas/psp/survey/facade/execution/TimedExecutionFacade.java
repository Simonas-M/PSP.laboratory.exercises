package com.simonas.psp.survey.facade.execution;

import com.simonas.psp.survey.data.dto.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dto.UserSurvey;
import com.simonas.psp.survey.facade.ExecutionFacade;
import org.springframework.stereotype.Component;

@Component
public class TimedExecutionFacade implements ExecutionFacade {

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
