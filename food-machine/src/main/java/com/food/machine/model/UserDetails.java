package com.food.machine.model;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class UserDetails {
	
	
	private String userName;
	
	private String userMobileNumber;
	
	private UserCurrentAddress userCurrentAddress;
	
	private Integer foodMachineCode;
	

}
