package com.example.demo.model;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class EmployeeDto {
    private UUID id;
    private String name;
    private Boolean status;

    private String email;
}
