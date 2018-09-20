package org.vicnesh.parkingsystem;

import java.util.*;


public class Vehicle{
	
	private String licensePlateNumber;
	private ParkingTicket parkingTicket;
	
	public Vehicle(String licensePlateNumberInput) {
		this.licensePlateNumber = licensePlateNumberInput;
		System.out.println("New vehicle created: " + this.licensePlateNumber);
	}
	
	
	public String getLicensePlateNumber() {
		return this.licensePlateNumber;
	}
	
	
	public void setParkingTicket(ParkingTicket parkingTicketIssued) {
		this.parkingTicket = parkingTicketIssued;
	}
	
	public ParkingTicket getParkingTicket() {
		return this.parkingTicket;
	}
	
	
	
	
}