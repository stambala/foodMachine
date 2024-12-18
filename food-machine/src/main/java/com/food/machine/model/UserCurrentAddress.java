package com.food.machine.model;


import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class UserCurrentAddress {
	
	private String cityName;
	
	private String areaName;
	
	private String streetNameOrNumber;
	
	private long zipcode;
	

}
