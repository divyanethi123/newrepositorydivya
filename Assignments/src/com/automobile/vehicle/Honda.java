package com.automobile.vehicle;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

	
	public String getModelName() {
		
		return "honda";
	}


	public String getRegistrationNumber() {
		
		return "Ts653528";
	}

	
	public String getOwnerName() {

		return "divya";
	}
	public int getSpeed()
	{
		return 100;
		
	}
	public void cdplayer()
	{
		System.out.println("provide facility to control the cd player devices which is avalable in the car");
	}

}
