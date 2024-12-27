package com.food.machine.practices;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("ALL")
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonToJavaObject {

    private boolean userBiometric;

    private String foodItems;

    private double foodQuantity;

    private String foodDamageOrNot;

    private String location;

    private String expiryDate;

    private String preparedBy;

    private String ingredients;

    private double temperature;

    private String packageType;

    private String deliveryMode;

    private boolean isOrganic;

    private int calories;

    private int servings;

    private String feedback;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "userBiometric=" + userBiometric +
                ", foodItems='" + foodItems + '\'' +
                ", foodQuantity=" + foodQuantity +
                ", foodDamageOrNot='" + foodDamageOrNot + '\'' +
                ", location='" + location + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", preparedBy='" + preparedBy + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", temperature=" + temperature +
                ", packageType='" + packageType + '\'' +
                ", deliveryMode='" + deliveryMode + '\'' +
                ", isOrganic=" + isOrganic +
                ", calories=" + calories +
                ", servings=" + servings +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
