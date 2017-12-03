package com.simonas.psp.survey.repository.user;

import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.data.factory.UserFactory;
import com.simonas.psp.survey.repository.UserRepository;
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
