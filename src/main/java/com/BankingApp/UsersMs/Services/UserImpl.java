package com.BankingApp.UsersMs.Services;

import com.BankingApp.UsersMs.Models.UserModel;
import com.BankingApp.UsersMs.Repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImpl implements UserInterface{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserModel getUserById(Long userId) {
        Optional<UserModel> user = userRepository.findById(userId);
        return user.orElse(null);
    }

    @Override
    public UserModel getUserByUsername(String username) {
        Optional<UserModel> user = userRepository.findByUsername(username);
        return user.orElse(null);
    }
}
