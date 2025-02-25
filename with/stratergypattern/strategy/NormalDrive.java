package com.with.stratergypattern.strategy;

public class NormalDrive implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("Normal Drive Mode");
	}

}
