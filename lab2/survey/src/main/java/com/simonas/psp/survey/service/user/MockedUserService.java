package com.simonas.psp.survey.service.user;

import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.data.factory.UserFactory;
import com.simonas.psp.survey.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class MockedUserService implements UserService {
    private UserFactory userFactory;

    public MockedUserService(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    @Override
    public User createUser(String nickname, String password) {
        return userFactory.create("username", "password");
    }

    @Override
    public boolean userExists(String nickname) {
        return false;
    }

    @Override
    public boolean isPasswordCorrect(String nickname, String password) {
        return false;
    }
}
