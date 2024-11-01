package com.app.OrderlyGrocer.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.OrderlyGrocer.dto.CustomerDto;
import com.app.OrderlyGrocer.mapper.CustomerMapper;
import com.app.OrderlyGrocer.model.CustomerEntity;
import com.app.OrderlyGrocer.repository.CustomerRepository;
import com.app.OrderlyGrocer.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDto createCustomer(CustomerDto customer) {

        CustomerEntity customerEntity= CustomerMapper.convertToEntity(customer);
        CustomerEntity savedCustomer=customerRepository.save(customerEntity);

         return CustomerMapper.convertToDto(savedCustomer);

    }

    @Override
    public CustomerDto getCustomerById(Long id) {

        CustomerEntity customerEntity=customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer with "+ id+" does not Exist"));
    
       return CustomerMapper.convertToDto(customerEntity);
    }

    @Override
    public List<CustomerDto> getAllCustomer() {

        List<CustomerDto> customer=new ArrayList<>();
        List<CustomerEntity> allCustomer=customerRepository.findAll();
        
        for(CustomerEntity c:allCustomer){
            customer.add(CustomerMapper.convertToDto(c));
        }
        return customer;
    }



	

    
    
}
