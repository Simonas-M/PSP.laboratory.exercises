package com.simonas.psp.survey.repositories;

import com.simonas.psp.survey.data.entities.User;
import java.util.List;

public interface UserRepository {
    void addUser(User user);

    List<User> getAll();

    User getById(String id);
}
