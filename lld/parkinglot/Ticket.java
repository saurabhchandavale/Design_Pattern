package com.lld.parkinglot;

import java.time.LocalDateTime;

public class Ticket {
	
	    private String vehiclePlate;
	    private String slotId;
	    private LocalDateTime issuedAt;

	    public Ticket(String vehiclePlate, String slotId) {
	        this.vehiclePlate = vehiclePlate;
	        this.slotId = slotId;
	        this.issuedAt = LocalDateTime.now();
	    }

	    public String getVehiclePlate() {
	        return vehiclePlate;
	    }

	    public String getSlotId() {
	        return slotId;
	    }

	    public LocalDateTime getIssuedAt() {
	        return issuedAt;
	    }

		@Override
		public String toString() {
			return "Ticket [vehiclePlate=" + vehiclePlate + ", slotId=" + slotId + ", issuedAt=" + issuedAt + "]";
		}
	    
	    
}
