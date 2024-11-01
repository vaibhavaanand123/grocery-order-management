package com.app.OrderlyGrocer.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDto {
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phoneNo;
    
}
