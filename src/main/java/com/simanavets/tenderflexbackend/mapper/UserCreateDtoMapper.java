package com.simanavets.tenderflexbackend.mapper;

import com.simanavets.tenderflexbackend.dto.UserCreateDto;
import com.simanavets.tenderflexbackend.entity.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserCreateDtoMapper implements Function<UserCreateDto, User> {

    @Override
    public User apply(UserCreateDto userCreateDto) {
        return User.builder()
                .userName(userCreateDto.userName())
                .email(userCreateDto.email())
                .password(userCreateDto.passWord())
                .role(userCreateDto.role())
                .build();
    }
}