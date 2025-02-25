package com.lld.parkinglot;

import java.util.List;

public class ParkingFloor {

	private String floorID;
	public List<ParkingSlot> slots;
	
	public ParkingFloor(String floorID, List<ParkingSlot> slots) {
		super();
		this.floorID = floorID;
		this.slots = slots;
	}
	
	 public ParkingSlot findAvailableSlot(VehicleType type) {
	        for (ParkingSlot slot : slots) {
	            if (slot.isAvailable() && slot.getSlotId().startsWith(type.name())) {
	                return slot;
	            }
	        }
	        return null;
	    }
	
}
