package com.simonas.psp.survey.facades;

import com.simonas.psp.survey.data.dtos.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dtos.UserSurvey;
import com.simonas.psp.survey.data.entities.Question;

import java.util.Map;

public interface ExecutionFacade {
    String answer(String userId, String surveyId, String questionId, String answer);

    String answer(SurveyQuestionAnswer surveyQuestionAnswer);

    String getUserProgress(String userId, String surveyId);

    String getUserProgress(UserSurvey userSurvey);
}
