package com.simonas.psp.survey.data.factory;

import com.simonas.psp.survey.data.entity.User;

public interface UserFactory {
    User create(String nickname, String password);
}
