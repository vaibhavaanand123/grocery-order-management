package com.app.OrderlyGrocer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class GroceryItem {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@NotNull(message="Iten Name is Mandatory")
private String itenName;

private String category;

@NotNull(message="Price of Iten is Mandatory")
private Double price;

private Long Quantity;
    
}
