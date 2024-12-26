package org.food.items.service;

import org.food.items.entity.FoodItemEntity;

import java.util.List;

public interface FoodItemService {
    FoodItemEntity addFoodItem(FoodItemEntity foodItemEntity);

    FoodItemEntity getFoodItemById(Long id);

    List<FoodItemEntity> addFoodItemsList (List<FoodItemEntity> foodItemEntity);
}
