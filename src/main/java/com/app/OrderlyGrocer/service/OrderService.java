package com.app.OrderlyGrocer.service;

import java.util.List;

import com.app.OrderlyGrocer.dto.OrderDto;

public interface OrderService {

    List<OrderDto> getAllOrder();

    OrderDto createOrder(Long customerid,Long itemid);
    
}
