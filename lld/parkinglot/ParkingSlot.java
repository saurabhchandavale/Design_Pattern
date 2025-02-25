package com.lld.parkinglot;

public class ParkingSlot {
	private String sloctID;
	private boolean isAvailable;
	private VehicleType slotType;
	private Vehicle parkedVehicle;
	
	public ParkingSlot(String sloctID, VehicleType slotType) {
		this.sloctID = sloctID;
		this.slotType = slotType;
		this.isAvailable = true;
	}
	
	public boolean parkVehicle(Vehicle vehicle) {
		if(isAvailable && vehicle.getType() == slotType) {
			this.parkedVehicle = vehicle;
			this.isAvailable = false;
			return true;
		}
		return false;
	}
	
	public void unparkVehicle() {
		this.parkedVehicle = null;
		this.isAvailable = true;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public String getSlotId() {
		return sloctID;
	}
	
	

}
