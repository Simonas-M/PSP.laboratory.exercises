package com.simonas.psp.survey.services.user;

import com.simonas.psp.survey.services.UserService;

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
