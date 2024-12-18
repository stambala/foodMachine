package com.food.machine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@SuppressWarnings("unchecked")
public class UserDataEntity {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	private boolean userBiometric;
	
	private String foodItems;
	
	private double foodQuantity;
	
	private String foodDamageOrNot;
	
}
