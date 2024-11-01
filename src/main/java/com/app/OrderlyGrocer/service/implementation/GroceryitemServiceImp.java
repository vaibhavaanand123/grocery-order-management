package com.app.OrderlyGrocer.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.OrderlyGrocer.dto.GroceryItemDto;
import com.app.OrderlyGrocer.mapper.GroceryItemMapper;
import com.app.OrderlyGrocer.model.GroceryItemEntity;
import com.app.OrderlyGrocer.repository.GroceryRepository;
import com.app.OrderlyGrocer.service.GroceryItemService;

@Service
public class GroceryitemServiceImp implements GroceryItemService {

    @Autowired
    private GroceryRepository groceryRepository;

    @Override
    public GroceryItemDto createGroceryItem(GroceryItemDto item) {

        GroceryItemEntity groceryItemEntity=GroceryItemMapper.convertGroceryItemToEntity(item);

        GroceryItemEntity savedGroceryItem=groceryRepository.save(groceryItemEntity);

        return GroceryItemMapper.convertGroceryItemtoDto(savedGroceryItem);

   }

	@Override
	public List<GroceryItemDto> allGroceryItems() {

        List<GroceryItemDto> groceryItemDtos=new ArrayList<>();

        List<GroceryItemEntity> groceryItemEntity=groceryRepository.findAll();

        for(GroceryItemEntity ge:groceryItemEntity){
            groceryItemDtos.add(GroceryItemMapper.convertGroceryItemtoDto(ge));
        }

        return groceryItemDtos;
	}

    @Override
    public GroceryItemDto findItemById(Long id){

        GroceryItemEntity groceryItemEntity=groceryRepository.findById(id).orElseThrow(()->new RuntimeException("Item with "+ id +"doest not Exist"));

        return GroceryItemMapper.convertGroceryItemtoDto(groceryItemEntity);
    }
    
}
