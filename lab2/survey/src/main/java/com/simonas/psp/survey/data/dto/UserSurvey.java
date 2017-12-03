package com.simonas.psp.survey.data.dto;

import javax.validation.constraints.NotNull;

public class UserSurvey {
    @NotNull
    private String userId;
    @NotNull
    private String surveyId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
}