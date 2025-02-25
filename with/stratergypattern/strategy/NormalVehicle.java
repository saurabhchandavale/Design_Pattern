package com.with.stratergypattern.strategy;

public class NormalVehicle extends Vehicle {

	public NormalVehicle() {
		super(new NormalDrive());
	}
	
	

}
