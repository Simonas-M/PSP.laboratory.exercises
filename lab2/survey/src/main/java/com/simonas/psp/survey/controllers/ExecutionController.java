package com.simonas.psp.survey.controllers;

import com.simonas.psp.survey.data.dtos.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dtos.UserSurvey;
import com.simonas.psp.survey.facades.ExecutionFacade;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExecutionController {
    private ExecutionFacade executionFacade;

    public ExecutionController(ExecutionFacade executionFacade) {
        this.executionFacade = executionFacade;
    }

    @RequestMapping(value = "/execute", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody SurveyQuestionAnswer questionAnswer) {
        return executionFacade.answer(questionAnswer);
    }

    @RequestMapping("")
    @ResponseBody
    public String getProgress(@ModelAttribute UserSurvey userSurvey) {
        return executionFacade.getUserProgress(userSurvey);
    }
}
