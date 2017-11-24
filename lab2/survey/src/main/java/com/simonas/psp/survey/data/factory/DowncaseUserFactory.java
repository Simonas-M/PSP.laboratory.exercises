package com.simonas.psp.survey.data.factory;


import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.data.entity.user.DowncasedUser;
import org.springframework.stereotype.Component;

@Component
public class DowncaseUserFactory implements UserFactory {
    @Override
    public User create(String nickname, String password) {
        return new DowncasedUser(nickname, password);
    }
}
