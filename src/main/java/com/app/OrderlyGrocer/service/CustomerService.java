package com.app.OrderlyGrocer.service;

import java.util.List;

import com.app.OrderlyGrocer.dto.CustomerDto;


public interface CustomerService {
   
    CustomerDto createCustomer(CustomerDto customer);

    CustomerDto getCustomerById(Long id);

    List<CustomerDto> getAllCustomer();
    
    
}
