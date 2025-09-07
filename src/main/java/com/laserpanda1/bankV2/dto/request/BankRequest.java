package com.laserpanda1.bankV2.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankRequest {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 30, message = "min: 2 , max: 30")
    private String name;

    @Pattern(regexp = "^[A-F]$", message = "Rating must be a single letter from A to F")
    private String rating;

    @NotBlank(message = "Country is required")
    @Size(min = 2, max = 50, message = "Country must be between 2 and 50 characters")
    private String country;

    @Email(message = "Email should be valid")
    private String contactEmail;


}

