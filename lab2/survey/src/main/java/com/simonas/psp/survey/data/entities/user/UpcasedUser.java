package com.simonas.psp.survey.data.entities.user;

import com.simonas.psp.survey.data.entities.User;

public class UpcasedUser extends User {
    public UpcasedUser(String nickname, String password) {
        super(nickname.toUpperCase(), password);
    }
}
