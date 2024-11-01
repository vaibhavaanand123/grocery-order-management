package com.app.OrderlyGrocer.mapper;

import java.util.List;

import com.app.OrderlyGrocer.dto.OrderDto;
import com.app.OrderlyGrocer.model.CustomerEntity;
import com.app.OrderlyGrocer.model.GroceryItemEntity;
import com.app.OrderlyGrocer.model.OrderEntity;

public class OrderMapper {


    public static OrderEntity convertToEntity(OrderDto order){

        OrderEntity orderEntity=new OrderEntity();

        orderEntity.setCustomer(order.getCustomer());
        orderEntity.setGroceryItem(order.getGroceryItem());

        return orderEntity;
    }

    public static OrderDto convertToDto(OrderEntity order){

        OrderDto orderDto=new OrderDto();
        orderDto.setId(order.getId());
        orderDto.setCustomer(order.getCustomer());
        orderDto.setGroceryItem(order.getGroceryItem());
        orderDto.setOrderDate(order.getOrderDate());
        orderDto.setTotalPrive(order.getTotalPrice());

        return orderDto;
    }

    public static OrderEntity mapping(CustomerEntity customer,List<GroceryItemEntity> item,Double price){

        OrderEntity order=new OrderEntity();

        order.setCustomer(customer);
        order.setGroceryItem(item);
        order.setTotalPrice(price);

        return order;

    }
    
}
