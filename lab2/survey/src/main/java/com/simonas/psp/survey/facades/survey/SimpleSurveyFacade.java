package com.simonas.psp.survey.facades.survey;

import com.simonas.psp.survey.data.entities.Survey;
import com.simonas.psp.survey.facades.SurveyFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleSurveyFacade implements SurveyFacade {
    @Override
    public Survey getSurveyById(String id) {
        return null;
    }

    @Override
    public List<Survey> getAllSurveys() {
        return null;
    }
}
