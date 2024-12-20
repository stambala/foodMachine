package com.food.machine.service;

import com.food.machine.Repository.UserRepository;
import com.food.machine.entity.UserDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDataEntity savePersons(UserDataEntity userdataEntity) {
        return userRepository.save(userdataEntity);

    }

    @Override
    public UserDataEntity getByUserId(String id) {
        Optional<UserDataEntity> optional = userRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return optional.orElseThrow();
        }

    }

    @Override
    public List<UserDataEntity> getAllData() {
        return userRepository.findAll();

    }

}