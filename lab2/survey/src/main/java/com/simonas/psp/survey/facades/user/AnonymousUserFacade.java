package com.simonas.psp.survey.facades.user;

import com.simonas.psp.survey.data.dtos.UserCredentials;
import com.simonas.psp.survey.facades.UserFacade;
import org.springframework.stereotype.Component;

@Component
public class AnonymousUserFacade implements UserFacade {

    @Override
    public void login(UserCredentials params) {
//        return userRepository.addUser("temp", "temp");
        System.out.println(String.format("hello %s from AnonymousUserFacade", params));
    }

    @Override
    public String signUp(UserCredentials params) {
        return "There's no registration required";
    }
}
