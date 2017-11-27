package com.simonas.psp.survey.facade;

import com.simonas.psp.survey.data.dto.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dto.UserSurvey;

public interface ExecutionFacade {
    String answer(SurveyQuestionAnswer surveyQuestionAnswer);

    String getUserProgress(String userId, String surveyId);

    String getUserProgress(UserSurvey userSurvey);
}
