package com.simonas.psp.survey.facade.user;

import com.simonas.psp.survey.data.dto.UserCredentials;
import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.facade.UserFacade;
import com.simonas.psp.survey.service.InformationDeliveryService;
import com.simonas.psp.survey.repository.UserRepository;
import com.simonas.psp.survey.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegisteredUserFacade implements UserFacade {
    private UserRepository userRepository;
    private UserService userService;
    private InformationDeliveryService informationDeliveryService;

    public RegisteredUserFacade(InformationDeliveryService informationDeliveryService,
                                UserRepository userRepository,
                                UserService userService) {
        this.informationDeliveryService = informationDeliveryService;
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @Override
    public String login(UserCredentials credentials) {
        if (userService.userExists(credentials.getNickname())) {
            if (userService.isPasswordCorrect(credentials.getNickname(), credentials.getPassword())) {
                return "You have successfully logged in, " + credentials.getNickname();
            }
        }
        return "Please check your credentials";
    }

    @Override
    public String signUp(UserCredentials credentials) {
        if (!userService.userExists(credentials.getNickname())) {
            User user = userService.createUser(credentials.getNickname(), credentials.getPassword());
            userRepository.addUser(user);
            informationDeliveryService.sendMessage(user, "Thanks for joining Survey Portal");
            return "Success";
        }
        return "User with nickname " + credentials.getNickname() + " already exists";
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }
}
