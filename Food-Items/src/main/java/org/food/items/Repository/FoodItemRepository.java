package org.food.items.Repository;

import org.food.items.entity.FoodItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItemEntity, Long> {
}
