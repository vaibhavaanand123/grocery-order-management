package com.app.OrderlyGrocer.mapper;

import com.app.OrderlyGrocer.dto.CustomerDto ;
import com.app.OrderlyGrocer.model.CustomerEntity;

public class CustomerMapper {

	public static CustomerEntity convertToEntity(CustomerDto customer) {
		CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName(customer.getName());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setPhoneNo(customer.getPhoneNo());
        return customerEntity;

	}

    public static CustomerDto convertToDto(CustomerEntity customer){

        CustomerDto customerDto =new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setAddress(customer.getAddress());
        customerDto.setPhoneNo(customer.getPhoneNo());
        return customerDto;


        
    }
    
}
