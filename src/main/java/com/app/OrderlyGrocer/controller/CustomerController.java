package com.app.OrderlyGrocer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.OrderlyGrocer.dto.Customer;
import com.app.OrderlyGrocer.service.CustomerService;

import jakarta.validation.Valid;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> customers(){

        List<Customer> customer=customerService.getAllCustomer();

        return ResponseEntity.ok().body(customer);
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer ){

        customerService.createCustomer(customer);
        return ResponseEntity.ok().body(customer);
    }
    
}
