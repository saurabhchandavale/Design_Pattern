package com.lld.parkinglot;

import java.util.List;

public class ParkingLot { // singleton

	private static ParkingLot instance;
	private List<ParkingFloor> floors;

	public ParkingLot(List<ParkingFloor> floors) {
		super();
		this.floors = floors;
	}

	public static ParkingLot getInstance(List<ParkingFloor> floors) {
		if (instance == null) {
			instance = new ParkingLot(floors);
		}
		return instance;
	}

	public Ticket parkVehicle(Vehicle vehicle) {
		for (ParkingFloor floor : floors) {
			ParkingSlot slot = floor.findAvailableSlot(vehicle.getType());
			if (slot != null && slot.parkVehicle(vehicle)) {
				return new Ticket(vehicle.getLicensePlate(), slot.getSlotId());
			}
		}
		System.out.println("No available slot for vehicle type: " + vehicle.getType());
		return null;
	}

	public void unparkVehicle(Ticket ticket) {
		for (ParkingFloor floor : floors) {
			for (ParkingSlot slot : floor.slots) {
				if (slot.getSlotId().equals(ticket.getSlotId())) {
					slot.unparkVehicle();
					System.out.println("Vehicle with plate " + ticket.getVehiclePlate() + " has left the slot.");
					return;
				}
			}
		}
	}
}
