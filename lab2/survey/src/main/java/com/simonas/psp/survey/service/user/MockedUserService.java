package com.simonas.psp.survey.service.user;

import com.simonas.psp.survey.service.UserService;

public class MockedUserService implements UserService {
    @Override
    public boolean userExists(String nickname) {
        return false;
    }

    @Override
    public boolean isPasswordCorrect(String nickname, String password) {
        return false;
    }
}
