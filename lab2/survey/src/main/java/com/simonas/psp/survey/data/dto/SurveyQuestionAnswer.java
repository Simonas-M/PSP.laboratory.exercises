package com.simonas.psp.survey.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class SurveyQuestionAnswer {
    @JsonProperty("user_id")@NotNull
    private String userId;
    @JsonProperty("survey_id")@NotNull
    private String surveyId;
    @JsonProperty("question_id")@NotNull
    private String questionId;
    private String answer;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
}
