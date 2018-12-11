package com.astontech.simplewebapp.services;

import com.astontech.simplewebapp.domain.User;
import com.astontech.simplewebapp.repositories.UserRepository;

import java.util.List;

public interface UserService {

    public User getUserById(Long id);

    public List<User> getAllUsers();

    public User getUserByName(String name);

    public User saveUser(User user);

    public void deleteUser(User user);

    public void deleteUserById(Long id);

}
