package com.food.machine.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

//import org.springframework.stereotype.Service;

import com.food.machine.entity.UserDataEntity;

//@Service
public interface UserService {

	UserDataEntity savePersons(UserDataEntity userdataEntity);
	
	UserDataEntity getByUserId(Integer id);
	
	List<UserDataEntity> getAllData();
	
}
