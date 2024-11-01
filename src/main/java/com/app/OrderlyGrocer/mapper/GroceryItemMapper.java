package com.app.OrderlyGrocer.mapper;

import com.app.OrderlyGrocer.dto.GroceryItemDto;
import com.app.OrderlyGrocer.model.GroceryItemEntity;

public class GroceryItemMapper {


    public static GroceryItemEntity convertGroceryItemToEntity(GroceryItemDto item){
        
        GroceryItemEntity groceryItemEntity=new GroceryItemEntity();

        groceryItemEntity.setItemName(item.getItemName());
        groceryItemEntity.setPrice(item.getPrice());
        groceryItemEntity.setQuantity(item.getQuantity());
        return groceryItemEntity;
    }

    public static GroceryItemDto convertGroceryItemtoDto(GroceryItemEntity item){
        
        GroceryItemDto groceryItemDto=new GroceryItemDto();
        groceryItemDto.setId(item.getId());
        groceryItemDto.setItemName(item.getItemName());
        groceryItemDto.setPrice(item.getPrice());
        groceryItemDto.setQuantity(item.getQuantity());
        return groceryItemDto;
    }
    
}
