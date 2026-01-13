package com.example.usermanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "designations")
public class Designation extends BaseEntity {

    @Column(nullable = false, unique = true, length = 120)
    private String title;

    @Column(length = 400)
    private String description;
}
