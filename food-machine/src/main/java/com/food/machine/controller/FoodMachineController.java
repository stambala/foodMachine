package com.food.machine.controller;

import com.food.machine.entity.UserDataEntity;
import com.food.machine.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodMachineController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/id")
    public ResponseEntity<UserDataEntity> createPersons(@RequestBody UserDataEntity userdataEntity) {
        UserDataEntity createdPersons = userServiceImpl.savePersons(userdataEntity);
        return new ResponseEntity<>(createdPersons, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public UserDataEntity getByUserId(@PathVariable String id) {
        return userServiceImpl.getByUserId(id);

    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDataEntity>> getAllData() {
        return ResponseEntity.ok(userServiceImpl.getAllData());

    }
}
