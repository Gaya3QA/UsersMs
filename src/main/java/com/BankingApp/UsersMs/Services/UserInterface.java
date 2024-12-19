package com.BankingApp.UsersMs.Services;

import com.BankingApp.UsersMs.Models.UserModel;

import java.util.List;

public interface UserInterface {
    UserModel createUser(UserModel user);
    List<UserModel> getAllUsers();
    UserModel getUserById(Long userId);
    UserModel getUserByUsername(String username);
}
