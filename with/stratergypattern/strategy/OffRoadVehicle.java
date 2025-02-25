package com.with.stratergypattern.strategy;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		super(new SpecialDrive());
	}

}
