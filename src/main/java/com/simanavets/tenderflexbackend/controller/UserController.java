package com.simanavets.tenderflexbackend.controller;

import com.simanavets.tenderflexbackend.dto.UserCreateDto;
import com.simanavets.tenderflexbackend.entity.User;
import com.simanavets.tenderflexbackend.mapper.UserCreateDtoMapper;
import com.simanavets.tenderflexbackend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody @Valid UserCreateDto userDto) {

        User user = new UserCreateDtoMapper().apply(userDto);
        userService.saveUser(user);
    }
}