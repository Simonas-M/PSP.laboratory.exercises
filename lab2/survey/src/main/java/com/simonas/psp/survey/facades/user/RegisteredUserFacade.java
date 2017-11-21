package com.simonas.psp.survey.facades.user;

import com.simonas.psp.survey.data.dtos.UserCredentials;
import com.simonas.psp.survey.facades.UserFacade;
import org.springframework.stereotype.Component;

@Component
public class RegisteredUserFacade implements UserFacade {

    @Override
    public void login(UserCredentials params) {
        System.out.println("hello from RegisteredUserFacade");
        // user = InMemorySurveyRepository.getUser(nickname, password)
        // check if user exists in the database
        // if he exists login, otherwise throw exception or something
    }

    @Override
    public String signUp(UserCredentials params) {
        System.out.println("Please Register dude");
        return "Your all up to go";
    }
}
