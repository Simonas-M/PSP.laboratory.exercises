package com.simonas.psp.survey.facade;

import com.simonas.psp.survey.data.entity.Survey;

import java.util.List;

public interface SurveyFacade {

    Survey getSurveyById(String id);

    List<Survey> getAllSurveys();
}
