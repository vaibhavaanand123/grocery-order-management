package com.app.OrderlyGrocer.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.OrderlyGrocer.dto.Customer;
import com.app.OrderlyGrocer.model.CustomerEntity;
import com.app.OrderlyGrocer.repository.CustomerRepository;
import com.app.OrderlyGrocer.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void createCustomer(Customer customer) {

        CustomerEntity customerEntity= convertToEntity(customer);
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
            customer.add(convertToDto(c));
        }
        return customer;
    }



	@Override
	public CustomerEntity convertToEntity(Customer customer) {
		CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName(customer.getName());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setPhoneNo(customer.getPhoneNo());
        return customerEntity;

	}

    public Customer convertToDto(CustomerEntity customer){

        Customer customerDto =new Customer();
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setAddress(customer.getAddress());
        customerDto.setPhoneNo(customer.getPhoneNo());
        return customerDto;


        
    }

    
    
}
