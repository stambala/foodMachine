package com.food.machine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.food.machine.Repository.UserRepository;
import com.food.machine.entity.UserDataEntity;



@Service
public class UserServiceImpl implements UserService{	
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDataEntity savePersons( UserDataEntity userdataEntity) {
		return userRepository.save(userdataEntity);
		
	}
	
	@Override
	public UserDataEntity getByUserId(Integer id){
		Optional<UserDataEntity> optional = userRepository.findById(id); 
		if(optional.isPresent()) {
			return optional.get();
		}
		else{
			 return optional.orElseThrow();
		}
		
	}
	
	@Override
	public List<UserDataEntity> getAllData() {
		return userRepository.findAll();
		
	}

}