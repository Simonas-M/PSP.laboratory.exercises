package com.simonas.psp.survey.facades.survey;

import com.simonas.psp.survey.data.entities.Survey;
import com.simonas.psp.survey.facades.SurveyFacade;
import com.simonas.psp.survey.repositories.SurveyRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MockedSurveyFacade implements SurveyFacade {
    private SurveyRepository surveyRepository;

    public MockedSurveyFacade(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @Override
    public Survey getSurveyById(String id) {
        return surveyRepository.getById(id);
    }

    @Override
    public List<Survey> getAllSurveys() {
        return surveyRepository.getAll();
    }
}
