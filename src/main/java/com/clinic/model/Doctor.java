package com.clinic.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Doctor extends User {

    private String doctorFullName;
    private String specialty;
}