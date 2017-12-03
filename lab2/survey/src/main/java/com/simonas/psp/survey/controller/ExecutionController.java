package com.simonas.psp.survey.controller;

import com.simonas.psp.survey.data.dto.SurveyQuestionAnswer;
import com.simonas.psp.survey.data.dto.UserSurvey;
import com.simonas.psp.survey.facade.ExecutionFacade;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ExecutionController {
    private ExecutionFacade executionFacade;

    public ExecutionController(ExecutionFacade executionFacade) {
        this.executionFacade = executionFacade;
    }

    @RequestMapping(value = "/execute", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody @Valid SurveyQuestionAnswer questionAnswer) {
        return executionFacade.answer(questionAnswer);
    }

    @RequestMapping("/progress")
    @ResponseBody
    public String getProgress(@ModelAttribute @Valid UserSurvey userSurvey) {
        return executionFacade.getUserProgress(userSurvey);
    }
}
