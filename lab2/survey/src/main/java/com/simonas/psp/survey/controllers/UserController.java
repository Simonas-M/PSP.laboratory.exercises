package com.simonas.psp.survey.controllers;

import com.simonas.psp.survey.data.dtos.UserCredentials;
import com.simonas.psp.survey.facades.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @RequestMapping("/login")
    @ResponseBody
    public void login(@ModelAttribute UserCredentials credentials) {
        userFacade.login(credentials);
    }

    @RequestMapping("/sign-up")
    public void signUp(@ModelAttribute UserCredentials credentials) {
        System.out.println(userFacade.signUp(credentials));
    }
}
