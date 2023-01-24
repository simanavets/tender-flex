package com.simanavets.tenderflexbackend.controller;

import com.simanavets.tenderflexbackend.entity.User;
import com.simanavets.tenderflexbackend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        userService.createUser(user);
        return "user is created";
    }

}
