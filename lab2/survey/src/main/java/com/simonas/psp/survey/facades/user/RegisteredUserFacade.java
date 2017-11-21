package com.simonas.psp.survey.facades.user;

import com.simonas.psp.survey.data.dtos.UserCredentials;
import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.data.factories.UserFactory;
import com.simonas.psp.survey.facades.UserFacade;
import com.simonas.psp.survey.repositories.UserRepository;
import com.simonas.psp.survey.services.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegisteredUserFacade implements UserFacade {
    private UserRepository userRepository;
    private UserService userService;
    private UserFactory userFactory;

    public RegisteredUserFacade(UserRepository userRepository,
                                UserService userService,
                                UserFactory userFactory) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.userFactory = userFactory;
    }

    @Override
    public String login(UserCredentials credentials) {
        if (userService.userExists(credentials.getNickname())) {
            if (userService.isPasswordCorrect(credentials.getPassword(), credentials.getPassword())) {
                return "You have successfully logged in";
            }
        }
        return "Please check your credentials";
    }

    @Override
    public String signUp(UserCredentials credentials) {
        if (!userService.userExists(credentials.getNickname())) {
            User user = userFactory.create(credentials.getNickname(), credentials.getPassword());
            userRepository.addUser(user);
            return "Success";
        }
        return "User with that nickname already exists";
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }
}
