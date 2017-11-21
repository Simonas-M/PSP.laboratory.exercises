package com.simonas.psp.survey.repositories.user;

import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MockedUserRepository implements UserRepository {
    private List<User> mockedUsers = new ArrayList<>(Arrays.asList(
        new User("Alfredo", "Gonzales"),
        new User("Lakeisha", "password123"),
        new User("Nikita", "idk_wtf"),
        new User("Liliana", "no-one-knows")
    ));

    @Override
    public void addUser(User user) {
        mockedUsers.add(new User("addedUser", "addedPassword"));
    }

    @Override
    public List<User> getAll() {
        return mockedUsers;
    }

    @Override
    public User getById(String id) {
        return mockedUsers.get(0);
    }
}
