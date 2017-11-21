package com.simonas.psp.survey.controllers;

import com.simonas.psp.survey.data.entities.Survey;
import com.simonas.psp.survey.facades.SurveyFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyController {
    private SurveyFacade surveyFacade;

    @Autowired
    public SurveyController(SurveyFacade surveyFacade) {
        this.surveyFacade = surveyFacade;
    }

    @RequestMapping("/survey/{id}")
    public Survey getSurveyById(@PathVariable String id) {
        return surveyFacade.getSurveyById(id);
    }

    @RequestMapping("/survey/all")
    public List<Survey> getAll() {
        return surveyFacade.getAllSurveys();
    }
}
