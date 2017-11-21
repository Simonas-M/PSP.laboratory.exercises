package com.simonas.psp.survey.data.factories;

import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.data.entities.user.UpcasedUser;
import org.springframework.stereotype.Component;

@Component
public class UpcaseUserFactory implements UserFactory {
    @Override
    public User create(String nickname, String password) {
        return new UpcasedUser(nickname, password);
    }
}
