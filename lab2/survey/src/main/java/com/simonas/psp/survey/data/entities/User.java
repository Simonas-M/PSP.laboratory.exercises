package com.simonas.psp.survey.data.entities;

import java.util.UUID;

public class User {
    private UUID id;
    private String nickname;
    private String password;

    public User(String nickname, String password) {
        this.id = UUID.randomUUID();
        this.nickname = nickname;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isCorrectPassword(String password) {
        return this.password.equals(password);
    }
}
