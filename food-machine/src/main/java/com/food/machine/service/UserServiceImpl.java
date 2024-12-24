package com.food.machine.service;

import com.food.machine.Repository.UserRepository;
import com.food.machine.entity.UserDataEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDataEntity savePersons(UserDataEntity userdataEntity) {
        log.info("Data saved with new id");
        return userRepository.save(userdataEntity);

    }

    @Override
    public UserDataEntity getByUserId(String id) {
        Optional<UserDataEntity> optional = userRepository.findById(id);
        if (optional.isPresent()) {
            log.info("Data found with id {}", id);
            return optional.get();
        } else {
            log.info("Data not found with id {}", id);
            return optional.orElseThrow();
        }
    }

    @Override
    public List<UserDataEntity> getAllData() {
        log.info("Data found successfully");
        return userRepository.findAll();
    }

}