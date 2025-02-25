package com.without.strategypattern;

public class TestImpl {

	public static void main(String[] args) {
		Vehicle vehicle = new SportVehicle();
		vehicle.drive();
		Vehicle v = new PassengerVehicle();
		v.drive();
		Vehicle v1 = new OffRoadVehicle();
		v1.drive();
		
	}

}
