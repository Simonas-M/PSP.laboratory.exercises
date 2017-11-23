package com.simonas.psp.survey.data.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SurveyQuestionAnswer {
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("survey_id")
    private String surveyId;
    @JsonProperty("question_id")
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
