package com.app.OrderlyGrocer.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.OrderlyGrocer.dto.Customer;
import com.app.OrderlyGrocer.mapper.CustomerMapper;
import com.app.OrderlyGrocer.model.CustomerEntity;
import com.app.OrderlyGrocer.repository.CustomerRepository;
import com.app.OrderlyGrocer.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void createCustomer(Customer customer) {

        CustomerEntity customerEntity= CustomerMapper.convertToEntity(customer);
         customerRepository.save(customerEntity);
    }

 

    @Override
    public Customer getCustomerById() {
    
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }

    @Override
    public List<Customer> getAllCustomer() {

        List<Customer> customer=new ArrayList<>();
        List<CustomerEntity> allCustomer=customerRepository.findAll();
        
        for(CustomerEntity c:allCustomer){
            customer.add(CustomerMapper.convertToDto(c));
        }
        return customer;
    }



	

    
    
}
