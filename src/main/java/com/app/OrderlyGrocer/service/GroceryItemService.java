package com.app.OrderlyGrocer.service;

import java.util.List;

import com.app.OrderlyGrocer.dto.GroceryItemDto;

public interface GroceryItemService {

    
    GroceryItemDto createGroceryItem(GroceryItemDto item);

    List<GroceryItemDto> allGroceryItems();
    public GroceryItemDto findItemById(Long id);
    
}
