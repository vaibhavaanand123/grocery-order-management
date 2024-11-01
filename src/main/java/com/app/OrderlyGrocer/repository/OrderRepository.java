package com.app.OrderlyGrocer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.OrderlyGrocer.model.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Long> {

    
    
}
