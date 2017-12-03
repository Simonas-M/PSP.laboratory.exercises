package com.simonas.psp.survey.service.user;

import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.data.factory.UserFactory;
import com.simonas.psp.survey.service.InformationDeliveryService;
import com.simonas.psp.survey.repository.UserRepository;
import com.simonas.psp.survey.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SimpleUserService implements UserService {
    private UserRepository userRepository;
    private UserFactory userFactory;
    private InformationDeliveryService informationDeliveryService;

    public SimpleUserService(UserRepository userRepository,
                             UserFactory userFactory,
                             InformationDeliveryService informationDeliveryService) {
        this.userRepository = userRepository;
        this.userFactory = userFactory;
        this.informationDeliveryService = informationDeliveryService;
    }

    @Override
    public User createUser(String nickname, String password) {
        getAdminUser().ifPresent(user ->
                informationDeliveryService.sendMessage(user, "User created: " + nickname)
        );
        return userFactory.create(nickname, password);
    }

    @Override
    public boolean userExists(String nickname) {
        return userRepository.getAll().stream()
            .anyMatch(user ->
                user.getNickname().toLowerCase().equals(nickname.toLowerCase())
            );
    }

    @Override
    public boolean isPasswordCorrect(String nickname, String password) {
        return userRepository.getAll().stream()
            .anyMatch(user -> user.getNickname().equals(nickname) && user.isCorrectPassword(password));
    }

    private Optional<User> getAdminUser() {
        return userRepository.getAll()
            .stream().filter(user ->
                user.getNickname().toLowerCase().equals("administrator"))
            .findFirst();
    }
}
