package com.example.usermanagement.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank @Size(min = 3, max = 80)
    private String username;

    @NotBlank @Email @Size(max = 200)
    private String email;

    @NotBlank @Size(min = 8, max = 120)
    private String password;

    @NotBlank @Size(max = 120)
    private String fullName;

    @NotBlank @Size(max = 120)
    private String designationTitle;

    @NotBlank @Size(max = 150)
    private String organizationName;

    @Valid
    private AddressDto address;
}
