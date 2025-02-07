package com.food.machine.Repository;

import com.food.machine.entity.BikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Component
public interface BikeRepository extends JpaRepository<BikeEntity, String> {
}
