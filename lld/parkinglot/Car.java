package com.lld.parkinglot;

public class Car extends Vehicle {
	private String licensePlate;
    private VehicleType type;

    public Car(String licensePlate) {
     super(licensePlate, VehicleType.CAR);
    }

  
}
