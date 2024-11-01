package com.app.OrderlyGrocer.dto;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import com.app.OrderlyGrocer.model.CustomerEntity;
import com.app.OrderlyGrocer.model.GroceryItemEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDto {
    private Long id;
    private CustomerEntity customer;
    private List<GroceryItemEntity> groceryItem;
    private LocalDateTime orderDate;
    private Double totalPrive;
    
}
