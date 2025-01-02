package com.food.machine.service;

import com.food.machine.entity.UserDataEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserDataEntity savePersons(UserDataEntity userdataEntity);

    UserDataEntity getByUserId(Integer id);

    List<UserDataEntity> getAllData();

    Optional<UserDataEntity> updateItem(Integer id, UserDataEntity userDataEntity);

    boolean deleteUser(Integer id);

}
