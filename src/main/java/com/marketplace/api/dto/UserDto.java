package com.marketplace.api.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class UserDto {

    @NotBlank
    private String userName;

    @Email
    @NotBlank
    private String email;

}
