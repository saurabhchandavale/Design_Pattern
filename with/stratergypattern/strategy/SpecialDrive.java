package com.with.stratergypattern.strategy;

public class SpecialDrive implements DriveStrategy  {

	@Override
	public void drive() {
		System.out.println("Special drive mode");
	}

}
