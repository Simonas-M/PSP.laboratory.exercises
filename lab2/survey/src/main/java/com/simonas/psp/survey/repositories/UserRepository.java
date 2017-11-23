package com.simonas.psp.survey.repositories;

import com.simonas.psp.survey.data.entities.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void addUser(User user);

    List<User> getAll();

    Optional<User> getById(String id);
}
