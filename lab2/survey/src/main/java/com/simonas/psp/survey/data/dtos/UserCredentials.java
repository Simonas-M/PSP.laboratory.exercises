package com.simonas.psp.survey.data.dtos;

public class UserCredentials {
    private String nickname;
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
