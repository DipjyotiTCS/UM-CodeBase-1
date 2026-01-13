package com.example.usermanagement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddressDto {

    @NotBlank @Size(max = 200)
    private String line1;

    @Size(max = 200)
    private String line2;

    @NotBlank @Size(max = 100)
    private String city;

    @NotBlank @Size(max = 100)
    private String state;

    @NotBlank @Size(max = 20)
    private String postalCode;

    @NotBlank @Size(max = 100)
    private String country;
}
