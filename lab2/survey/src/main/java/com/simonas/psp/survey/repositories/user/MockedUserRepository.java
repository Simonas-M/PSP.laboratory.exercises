package com.simonas.psp.survey.repositories.user;

import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.data.factories.UserFactory;
import com.simonas.psp.survey.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MockedUserRepository implements UserRepository {
    private UserFactory userFactory;

    private List<User> mockedUsers;

    public MockedUserRepository(UserFactory userFactory) {
        this.userFactory = userFactory;

        this.mockedUsers = new ArrayList<>(Arrays.asList(
            userFactory.create("Alfredo", "Gonzales"),
            userFactory.create("Lakeisha", "password123"),
            userFactory.create("Nikita", "idk_wtf"),
            userFactory.create("Liliana", "no-one-knows")
        ));
    }

    @Override
    public void addUser(User user) {
        mockedUsers.add(
            userFactory.create("addedUser", "addedPassword")
        );
    }

    @Override
    public List<User> getAll() {
        return mockedUsers;
    }

    @Override
    public Optional<User> getById(String id) {
        return Optional.of(mockedUsers.get(0));
    }
}
