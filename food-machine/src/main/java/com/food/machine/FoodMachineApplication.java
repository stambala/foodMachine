package com.food.machine;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.food.machine.practices.JsonToJavaObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodMachineApplication {

    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"id\":\"1\", \"name\":\"Pavan\", \"address\":\"Hyderabad\", " +
                "\"mobileNumber\":\"9553598034\", \"country\":\"India\"," +
                "  \"gender\":\"male\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonToJavaObject jsonDataToJavaObject = objectMapper.readValue(json, JsonToJavaObject.class);
        System.out.println(jsonDataToJavaObject);
        SpringApplication.run(FoodMachineApplication.class, args);
    }

}
