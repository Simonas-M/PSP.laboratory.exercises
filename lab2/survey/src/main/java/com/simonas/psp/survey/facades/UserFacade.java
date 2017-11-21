package com.simonas.psp.survey.facades;

import com.simonas.psp.survey.data.dtos.UserCredentials;

public interface UserFacade {
    void login(UserCredentials params);
    String signUp(UserCredentials params);
}
