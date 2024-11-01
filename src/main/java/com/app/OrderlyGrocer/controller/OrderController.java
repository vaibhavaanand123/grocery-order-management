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

import com.app.OrderlyGrocer.dto.OrderDto;
import com.app.OrderlyGrocer.dto.OrderRequestDto;
import com.app.OrderlyGrocer.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderDto>> getAllOrder(){

        List<OrderDto> listorder=orderService.getAllOrder();
        
        return ResponseEntity.ok().body(listorder);
    }

    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderRequestDto requestDto){
        OrderDto orderDto=orderService.createOrder(requestDto.getCustomerId(), requestDto.getItemId());

        return ResponseEntity.ok().body(orderDto);
    }
    
}
