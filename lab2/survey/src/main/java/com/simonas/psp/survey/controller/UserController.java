package com.simonas.psp.survey.controller;

import com.simonas.psp.survey.data.dto.UserCredentials;
import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.facade.UserFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserFacade userFacade;

    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(@ModelAttribute UserCredentials credentials) {
        return userFacade.login(credentials);
    }

    @RequestMapping("/sign-up")
    @ResponseBody
    public String signUp(@ModelAttribute UserCredentials credentials) {
        return userFacade.signUp(credentials);
    }

    @RequestMapping("/users/all")
    public List<User> listUsers() {
        return userFacade.getAll();
    }
}
