package com.simonas.psp.survey.data.factories;

import com.simonas.psp.survey.data.entities.User;

public interface UserFactory {
    User create(String nickname, String password);
}
