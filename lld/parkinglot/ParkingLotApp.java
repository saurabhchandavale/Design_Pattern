package com.lld.parkinglot;

import java.util.Arrays;
import java.util.List;

public class ParkingLotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create parking slots
		List<ParkingSlot> slots = Arrays.asList(new ParkingSlot("CAR1", VehicleType.CAR),
				new ParkingSlot("BIKE1", VehicleType.BIKE), new ParkingSlot("TRUCK1", VehicleType.TRUCK));

		// Create floors
		ParkingFloor floor1 = new ParkingFloor("F1", slots);

		// Initialize Parking Lot
		ParkingLot lot = ParkingLot.getInstance(Arrays.asList(floor1));

		// Create Vehicles
		Vehicle car = new Car("MH12AB1234");
		Vehicle bike = new Bike("MH14XY5678");

		// Park Vehicles
		Ticket carTicket = lot.parkVehicle(car);
		System.out.println("Vehicle is parked " + carTicket.toString());
		Ticket bikeTicket = lot.parkVehicle(bike);
		System.out.println("Vehicle is parked " + bikeTicket.toString());

		//Unpark Vehicles
		lot.unparkVehicle(carTicket);
	}

}
