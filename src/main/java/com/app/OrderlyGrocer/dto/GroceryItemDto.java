package com.app.OrderlyGrocer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroceryItemDto {
    private Long id;
    private String itemName;
    private Double price;
    private Long quantity;
}
