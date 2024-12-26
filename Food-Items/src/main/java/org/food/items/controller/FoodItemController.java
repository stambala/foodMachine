package org.food.items.controller;

import org.food.items.entity.FoodItemEntity;
import org.food.items.service.FoodItemService;
import org.food.items.service.FoodItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @PostMapping("/ids")
    public ResponseEntity<FoodItemEntity> addFoodItem(@RequestBody FoodItemEntity foodItemEntity) {
        FoodItemEntity savedItem = foodItemService.addFoodItem(foodItemEntity);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodItemEntity> getFoodItemById(@PathVariable Long id) {
        FoodItemEntity foodItem = foodItemService.getFoodItemById(id);
        return ResponseEntity.ok(foodItem);
    }
    @PostMapping("/itemsList")
    public ResponseEntity<List<FoodItemEntity>> addFoodItemSample(@RequestBody List<FoodItemEntity> foodItemEntity) {
        List<FoodItemEntity> savedItemsList = foodItemService.addFoodItemsList(foodItemEntity);
        return new ResponseEntity<>(savedItemsList, HttpStatus.CREATED);
    }
}
