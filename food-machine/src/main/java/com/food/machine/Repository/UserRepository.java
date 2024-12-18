package com.food.machine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.machine.entity.UserDataEntity;

@Repository
public interface UserRepository extends JpaRepository<UserDataEntity, Integer>{

}


