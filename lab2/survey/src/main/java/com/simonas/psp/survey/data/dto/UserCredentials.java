package com.simonas.psp.survey.data.dto;

import javax.validation.constraints.NotNull;

public class UserCredentials {
    @NotNull
    private String nickname;
    @NotNull
    private String password;

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nickname, password);
    }
}
