package com.simonas.psp.survey.repositories;

import com.simonas.psp.survey.data.entities.Survey;

import java.util.List;

public interface SurveyRepository {
    List<Survey> getAll();

    Survey getById(String id);
}
