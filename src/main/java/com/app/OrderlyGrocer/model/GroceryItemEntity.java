package com.app.OrderlyGrocer.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class GroceryItemEntity {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@NotNull(message="Iten Name is Mandatory")
private String itenName;

private String category;

@NotNull(message="Price of Iten is Mandatory")
private Double price;

private Long Quantity;

// @ManyToMany(mappedBy="groceryItems")
// private List<OrderEntity> orders;
    
}
