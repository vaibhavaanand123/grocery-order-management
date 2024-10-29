package com.app.OrderlyGrocer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotNull(message ="Name is Mandatory")
    private String name;

    @NotNull(message ="Email is Mandatory")
    @Email(message ="Invalid Email Format")
    private String email;

    private String adderss;

    @NotNull(message ="Contact detail is Mandatory")
    private String phoneNo;


    
}
