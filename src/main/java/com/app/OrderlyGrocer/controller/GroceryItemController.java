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

import com.app.OrderlyGrocer.dto.GroceryItemDto;
import com.app.OrderlyGrocer.service.GroceryItemService;

@RestController
@RequestMapping("/api/items")
public class GroceryItemController {

    @Autowired
    private GroceryItemService groceryItemService;


    @GetMapping
    public ResponseEntity<List<GroceryItemDto>> allitems(){
        
        List<GroceryItemDto> listItems=groceryItemService.allGroceryItems();

        return ResponseEntity.ok().body(listItems);
    }

    @PostMapping
    public ResponseEntity<GroceryItemDto> createItems(@RequestBody GroceryItemDto item){

        GroceryItemDto groceryItemDto=groceryItemService.createGroceryItem(item);

        return ResponseEntity.ok().body(groceryItemDto);
    }

    @GetMapping("/{id}")

    public ResponseEntity<GroceryItemDto> findItemsById(@PathVariable Long id){

        GroceryItemDto item =groceryItemService.findItemById(id);

        return ResponseEntity.ok().body(item);
    }



    
    
}
