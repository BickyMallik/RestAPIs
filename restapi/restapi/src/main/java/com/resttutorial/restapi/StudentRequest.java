package com.resttutorial.restapi;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentRequest {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be 2-50 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Branch is required")
    private String branch;

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getBranch() {
        return branch;
    }
}
