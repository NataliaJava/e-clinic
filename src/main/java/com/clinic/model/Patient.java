package com.clinic.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Patient extends User {

    private String fullName;
    private String email;
    private String phone;
}