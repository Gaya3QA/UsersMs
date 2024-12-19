package com.BankingApp.UsersMs.Contollers;

import com.BankingApp.UsersMs.Models.UserModel;
import com.BankingApp.UsersMs.Services.UserInterface;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserContoller {
    @Autowired
    private UserInterface userInterface;

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        return userInterface.createUser(user);
    }

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userInterface.getAllUsers();
    }

    @GetMapping("/{userId}")
    public UserModel getUserById(@PathVariable Long userId) {
        return userInterface.getUserById(userId);
    }
}
