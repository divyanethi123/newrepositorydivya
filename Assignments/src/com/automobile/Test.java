package com.automobile;
import com.automobile.Vehicle;
import com.automobile.twowheeler.Hero;
import com.automobile.vehicle.Honda;

public class Test {

	public static void main(String[] args) {
		Vehicle v1=new Hero();
		System.out.println("model name"+v1.getModelName());
		System.out.println("registration number"+v1.getRegistrationNumber());
		System.out.println("owner name"+v1.getOwnerName());
		Hero h1=new Hero();
		h1.radio();
		System.out.println(h1.getSpeed());
		v1=new Honda();
		System.out.println("model name"+v1.getModelName());
		System.out.println("registration number "+v1.getRegistrationNumber());
		System.out.println("owner name"+v1.getOwnerName());
		Honda h2=new Honda();
		h2.getSpeed();
		h2.cdplayer();
		
		
	}

}
