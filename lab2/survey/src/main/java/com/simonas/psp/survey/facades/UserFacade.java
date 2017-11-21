package com.simonas.psp.survey.facades;

import com.simonas.psp.survey.data.dtos.UserCredentials;
import com.simonas.psp.survey.data.entities.User;

import java.util.List;

public interface UserFacade {
    String login(UserCredentials params);
    String signUp(UserCredentials params);
    List<User> getAll();
}
