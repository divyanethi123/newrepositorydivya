package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle{

	public int getSpeed()
	{
		
		return 50;
	}
	public void radio()
	{
		System.out.println("it provide facility to control the radio device");
	}
	public String getModelName() {
		
		return "hero";
	}
	
	public String getRegistrationNumber() {
	
		return "TS543157";
	}
	
	public String getOwnerName() {
		
		return "srinivas";
	}


}
