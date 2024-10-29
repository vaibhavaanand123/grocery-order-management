package com.app.OrderlyGrocer.service;

import java.util.List;

import com.app.OrderlyGrocer.dto.Customer;
import com.app.OrderlyGrocer.model.CustomerEntity;


public interface CustomerService {
    Customer convertToDto(CustomerEntity customer);

    CustomerEntity convertToEntity(Customer customer);

    void createCustomer(Customer customer);

    Customer getCustomerById();

    List<Customer> getAllCustomer();
    
    
}
