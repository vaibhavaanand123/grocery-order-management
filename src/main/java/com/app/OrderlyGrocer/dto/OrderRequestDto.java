package com.app.OrderlyGrocer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequestDto {

    private Long customerId;
    private Long itemId;
    
}
