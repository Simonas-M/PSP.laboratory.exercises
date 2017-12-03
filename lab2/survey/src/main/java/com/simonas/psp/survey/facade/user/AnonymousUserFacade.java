package com.simonas.psp.survey.facade.user;

import com.simonas.psp.survey.data.dto.UserCredentials;
import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.facade.UserFacade;
import com.simonas.psp.survey.repository.UserRepository;
import com.simonas.psp.survey.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnonymousUserFacade implements UserFacade {
    private UserRepository userRepository;
    private UserService userService;

    public AnonymousUserFacade(UserRepository userRepository,
                               UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @Override
    public String login(UserCredentials credentials) {
        if (!userService.userExists("anonymous")) {
            User anonymousUser = userService.createUser("anonymous", "anonymous");
            userRepository.addUser(anonymousUser);
        }
        return "You have logged in as anonymous";
    }

    @Override
    public String signUp(UserCredentials credentials) {
        return "There's no registration required";
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
