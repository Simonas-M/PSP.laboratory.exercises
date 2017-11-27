package com.simonas.psp.survey.facade.execution;

import com.simonas.psp.survey.data.dto.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dto.UserSurvey;
import com.simonas.psp.survey.facade.ExecutionFacade;
import org.springframework.stereotype.Component;

@Component
public class MockedExecutionFacade implements ExecutionFacade {

    @Override
    public String answer(SurveyQuestionAnswer surveyQuestionAnswer) {
        return "Your answer has been saved";
    }

    @Override
    public String getUserProgress(UserSurvey userSurvey) {
        return "User progress is unavailable right now";
    }
}
