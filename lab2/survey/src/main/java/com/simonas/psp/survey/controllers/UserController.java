package com.simonas.psp.survey.controllers;

import com.simonas.psp.survey.data.dtos.UserCredentials;
import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.facades.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(@ModelAttribute UserCredentials credentials) {
        return userFacade.login(credentials);
    }

    @RequestMapping("/sign-up")
    public String signUp(@ModelAttribute UserCredentials credentials) {
        return userFacade.signUp(credentials);
    }

    @RequestMapping("/users/all")
    public List<User> listUsers() {
        return userFacade.getAll();
    }
}
