package com.simonas.psp.survey.facade;

import com.simonas.psp.survey.data.dto.UserCredentials;
import com.simonas.psp.survey.data.entity.User;

import java.util.List;

public interface UserFacade {
    String login(UserCredentials params);
    String signUp(UserCredentials params);
    List<User> getAll();
}
