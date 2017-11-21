package com.simonas.psp.survey.services;

public interface UserService {

    boolean userExists(String nickname);

    boolean isPasswordCorrect(String nickname, String password);
}
