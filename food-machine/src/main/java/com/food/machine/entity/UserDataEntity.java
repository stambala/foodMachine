package com.food.machine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class UserDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private boolean userBiometric;

    private String foodItems;

    private double foodQuantity;

    private String foodDamageOrNot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isUserBiometric() {
        return userBiometric;
    }

    public void setUserBiometric(boolean userBiometric) {
        this.userBiometric = userBiometric;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public double getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(double foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public String getFoodDamageOrNot() {
        return foodDamageOrNot;
    }

    public void setFoodDamageOrNot(String foodDamageOrNot) {
        this.foodDamageOrNot = foodDamageOrNot;
    }

    @Override
    public String toString() {
        return "UserDataEntity{" +
                "id=" + id +
                ", userBiometric=" + userBiometric +
                ", foodItems='" + foodItems + '\'' +
                ", foodQuantity=" + foodQuantity +
                ", foodDamageOrNot='" + foodDamageOrNot + '\'' +
                '}';
    }
}
