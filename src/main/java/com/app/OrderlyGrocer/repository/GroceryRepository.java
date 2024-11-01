package com.app.OrderlyGrocer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.OrderlyGrocer.model.GroceryItemEntity;


@Repository
public interface GroceryRepository extends JpaRepository<GroceryItemEntity,Long> {

    
    
}
