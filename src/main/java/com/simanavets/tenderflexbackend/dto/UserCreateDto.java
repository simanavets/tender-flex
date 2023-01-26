package com.simanavets.tenderflexbackend.dto;


import com.simanavets.tenderflexbackend.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserCreateDto(
        @Size(min = 3, max = 64) String userName,
        @NotBlank String passWord,
        @Email String email,
        Role role
) {
}
