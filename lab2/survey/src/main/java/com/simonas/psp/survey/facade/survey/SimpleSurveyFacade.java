package com.simonas.psp.survey.facade.survey;

import com.simonas.psp.survey.data.entity.Survey;
import com.simonas.psp.survey.facade.SurveyFacade;
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
