package com.simonas.psp.survey.facades;

import com.simonas.psp.survey.data.entities.Survey;

import java.util.List;

public interface SurveyFacade {

    Survey getSurveyById(String id);

    List<Survey> getAllSurveys();
}
