package com.simonas.psp.survey.repository;

import com.simonas.psp.survey.data.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void addUser(User user);

    List<User> getAll();

    Optional<User> getById(String id);
}
