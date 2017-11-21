package com.simonas.psp.survey.data.factories;


import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.data.entities.user.DowncasedUser;
import org.springframework.stereotype.Component;

@Component
public class DowncaseUserFactory implements UserFactory {
    @Override
    public User create(String nickname, String password) {
        return new DowncasedUser(nickname, password);
    }
}
