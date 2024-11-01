package com.app.OrderlyGrocer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.OrderlyGrocer.dto.CustomerDto;
import com.app.OrderlyGrocer.service.CustomerService;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //get all customer
    @GetMapping
    public ResponseEntity<List<CustomerDto>> customers(){

        List<CustomerDto> customer=customerService.getAllCustomer();

        return ResponseEntity.ok().body(customer);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Long id){

        CustomerDto customer=customerService.getCustomerById(id);

        return ResponseEntity.ok().body(customer);

    }

    //creat Customer 
    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customer ){
        CustomerDto savedCUstomer= customerService.createCustomer(customer);
        return ResponseEntity.ok().body(savedCUstomer);
    }
    

    
}
