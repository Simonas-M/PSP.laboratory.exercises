package com.simonas.psp.survey.facade.user;

import com.simonas.psp.survey.data.dto.UserCredentials;
import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.facade.UserFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnonymousUserFacade implements UserFacade {

    @Override
    public String login(UserCredentials credentials) {
//        return userRepository.addUser("temp", "temp");
        return String.format("hello %s from AnonymousUserFacade", credentials);
    }

    @Override
    public String signUp(UserCredentials credentials) {
        return "There's no registration required";
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
