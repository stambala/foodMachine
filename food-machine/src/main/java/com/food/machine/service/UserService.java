package com.food.machine.service;

import com.food.machine.entity.UserDataEntity;

import java.util.List;

public interface UserService {

    UserDataEntity savePersons(UserDataEntity userdataEntity);

    UserDataEntity getByUserId(String id);

    List<UserDataEntity> getAllData();

}
