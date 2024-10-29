package com.app.OrderlyGrocer.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @NotNull
    private Customer customer;

    
    @ManyToMany
    @NotNull
    private List<GroceryItem> groceryItem;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @NotNull 
    private Double totalPrive;

    
}
