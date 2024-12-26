package org.food.items.service;

import org.food.items.Repository.FoodItemRepository;
import org.food.items.entity.FoodItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FoodItemServiceImpl implements FoodItemService{

    @Autowired
    FoodItemRepository foodItemRepository;

    @Override
    public FoodItemEntity addFoodItem(FoodItemEntity foodItem) {
        return foodItemRepository.save(foodItem);
    }

    @Override
    public FoodItemEntity getFoodItemById(Long id) {
        Optional<FoodItemEntity> optionalFoodItem = foodItemRepository.findById(id);
        return optionalFoodItem.orElseThrow(() -> new RuntimeException("FoodItem not found with ID: " + id));
    }

    @Override
    public List<FoodItemEntity> addFoodItemsList(List<FoodItemEntity> foodItemEntity) {
        return List.of();
    }

}
