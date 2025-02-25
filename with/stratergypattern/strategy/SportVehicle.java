package com.with.stratergypattern.strategy;

public class SportVehicle extends Vehicle {

	public SportVehicle() {
		super(new SpecialDrive());
	}

}
