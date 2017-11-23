package com.simonas.psp.survey.repositories.user;

import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class SimpleUserRepository implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public Optional<User> getById(String id) {
        return users.stream()
            .filter(user -> user.getId().toString().equals(id))
            .findFirst();
    }
}
