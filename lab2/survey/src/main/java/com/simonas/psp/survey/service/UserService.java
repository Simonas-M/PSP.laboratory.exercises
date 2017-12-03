package com.simonas.psp.survey.service;

import com.simonas.psp.survey.data.entity.User;

public interface UserService {
    User createUser(String nickname, String password);

    boolean userExists(String nickname);

    boolean isPasswordCorrect(String nickname, String password);
}
