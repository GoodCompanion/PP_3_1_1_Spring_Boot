package com.kalinin.spring.app.service;

import com.kalinin.spring.app.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(Long id);

    List<User> getUsers();

    void updateUser(User user);

    void deleteUser(Long id);
}
