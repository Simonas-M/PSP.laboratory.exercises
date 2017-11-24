package com.simonas.psp.survey.service;

public interface UserService {

    boolean userExists(String nickname);

    boolean isPasswordCorrect(String nickname, String password);
}
