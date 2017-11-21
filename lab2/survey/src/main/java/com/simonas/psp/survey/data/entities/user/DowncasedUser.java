package com.simonas.psp.survey.data.entities.user;

import com.simonas.psp.survey.data.entities.User;

public class DowncasedUser extends User {
    public DowncasedUser(String nickname, String password) {
        super(nickname.toLowerCase(), password);
    }
}
