package com.food.machine.controller;

import com.food.machine.entity.UserDataEntity;
import com.food.machine.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/food")
public class FoodMachineController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/id")
    public ResponseEntity<UserDataEntity> createPersons(@RequestBody UserDataEntity userdataEntity) {
        UserDataEntity createdPersons = userServiceImpl.savePersons(userdataEntity);
        log.debug("Data saved");
        return new ResponseEntity<>(createdPersons, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public UserDataEntity getByUserId(@PathVariable String id) {
        log.debug("data fetched with id " + id);
        return userServiceImpl.getByUserId(id);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDataEntity>> getAllData() {
        log.info("Method executed successfully");
        return ResponseEntity.ok(userServiceImpl.getAllData());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDataEntity> updateItem(@PathVariable String id, @RequestBody UserDataEntity userDataEntity) {
        Optional<UserDataEntity> optionalItem = userServiceImpl.updateItem(id, userDataEntity);
        if (optionalItem.isPresent()) {
            log.info("Data updated successfully");
            return ResponseEntity.ok(optionalItem.get());
        } else {
            log.info("No data found");
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable String id) {
        boolean isDeleted = userServiceImpl.deleteUser(id);
        if (isDeleted) {
            return ResponseEntity.ok("Item deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Item not found.");
        }
    }
}
