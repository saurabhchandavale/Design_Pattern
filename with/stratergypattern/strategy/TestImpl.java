package com.with.stratergypattern.strategy;

public class TestImpl {

	public static void main(String[] args) {
		Vehicle v = new SportVehicle();
		v.drive();

		Vehicle v1 = new OffRoadVehicle();
		v1.drive();

		Vehicle v2 = new NormalVehicle();
		v2.drive();

	}

}
