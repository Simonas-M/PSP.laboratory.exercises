package com.simonas.psp.survey.data.entity.user;

import com.simonas.psp.survey.data.entity.User;

public class DowncasedUser extends User {
    public DowncasedUser(String nickname, String password) {
        super(nickname.toLowerCase(), password);
    }
}
