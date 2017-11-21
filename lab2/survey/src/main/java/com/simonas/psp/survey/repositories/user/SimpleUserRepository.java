package com.simonas.psp.survey.repositories.user;

import com.simonas.psp.survey.data.entities.User;
import com.simonas.psp.survey.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleUserRepository implements UserRepository {
    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }
}
