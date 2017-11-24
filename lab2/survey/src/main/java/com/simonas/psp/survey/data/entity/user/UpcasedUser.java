package com.simonas.psp.survey.data.entity.user;

import com.simonas.psp.survey.data.entity.User;

public class UpcasedUser extends User {
    public UpcasedUser(String nickname, String password) {
        super(nickname.toUpperCase(), password);
    }
}
