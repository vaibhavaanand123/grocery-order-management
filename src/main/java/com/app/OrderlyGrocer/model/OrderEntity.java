package com.app.OrderlyGrocer.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import jakarta.persistence.ManyToOne;


@Entity
@Data
public class OrderEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @NotNull
    private CustomerEntity customer;

    
    @ManyToMany
    @NotNull
    private List<GroceryItemEntity> groceryItem;

    
    @CreationTimestamp
    private LocalDateTime orderDate;

    @NotNull 
    private Double totalPrice;

    
}
