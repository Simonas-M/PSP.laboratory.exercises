package com.simonas.psp.survey.facade.survey;

import com.simonas.psp.survey.data.entity.Survey;
import com.simonas.psp.survey.facade.SurveyFacade;
import com.simonas.psp.survey.repository.SurveyRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleSurveyFacade implements SurveyFacade {
    private SurveyRepository surveyRepository;

    public SimpleSurveyFacade(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @Override
    public Survey getSurveyById(String id) {
        return surveyRepository.getById(id).orElse(null);
    }

    @Override
    public List<Survey> getAllSurveys() {
        return surveyRepository.getAll();
    }
}
