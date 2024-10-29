package com.app.OrderlyGrocer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.OrderlyGrocer.model.CustomerEntity;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
    
}
