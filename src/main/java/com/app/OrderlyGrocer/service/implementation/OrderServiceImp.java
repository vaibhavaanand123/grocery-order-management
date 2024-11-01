package com.app.OrderlyGrocer.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.OrderlyGrocer.dto.OrderDto;
import com.app.OrderlyGrocer.mapper.OrderMapper;
import com.app.OrderlyGrocer.model.CustomerEntity;
import com.app.OrderlyGrocer.model.GroceryItemEntity;
import com.app.OrderlyGrocer.model.OrderEntity;
import com.app.OrderlyGrocer.repository.CustomerRepository;
import com.app.OrderlyGrocer.repository.GroceryRepository;
import com.app.OrderlyGrocer.repository.OrderRepository;
import com.app.OrderlyGrocer.service.OrderService;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private GroceryRepository groceryRepository;
    @Autowired
    private OrderRepository orderRepository;

	@Override
	public List<OrderDto> getAllOrder() {

        List<OrderDto> orderDto=new ArrayList<>();

		
        List<OrderEntity> orderEntity=orderRepository.findAll();

        for(OrderEntity oe:orderEntity){
            orderDto.add(OrderMapper.convertToDto(oe));
        }

        return orderDto;

	}

	@Override
	public OrderDto createOrder(Long customerid,Long itemid) {

		List<GroceryItemEntity> listItem=new ArrayList<>();

        CustomerEntity customerEntity=customerRepository.findById(customerid).orElseThrow(()->new RuntimeException("Customer with "+ customerid +"doest not Exist"));
        
        GroceryItemEntity groceryItemEntity=groceryRepository.findById(itemid).orElseThrow(()->new RuntimeException("Item with "+ itemid +"doest not Exist"));
        
        listItem.add(groceryItemEntity);

        Double price=groceryItemEntity.getPrice();

        OrderEntity orderEntity=OrderMapper.mapping(customerEntity, listItem, price);
        
        OrderEntity savedOrder=orderRepository.save(orderEntity);

        return OrderMapper.convertToDto(savedOrder);
	}




    
    
}
