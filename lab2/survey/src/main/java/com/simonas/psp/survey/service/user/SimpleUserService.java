package com.simonas.psp.survey.service.user;

import com.simonas.psp.survey.repository.UserRepository;
import com.simonas.psp.survey.service.UserService;

public class SimpleUserService implements UserService {
    private UserRepository userRepository;

    public SimpleUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean userExists(String nickname) {
        return userRepository.getAll().stream()
            .anyMatch(user -> user.getNickname().equals(nickname));
    }

    @Override
    public boolean isPasswordCorrect(String nickname, String password) {
        return userRepository.getAll().stream()
            .anyMatch(user -> user.getNickname().equals(nickname) && user.isCorrectPassword(password));
    }
}
