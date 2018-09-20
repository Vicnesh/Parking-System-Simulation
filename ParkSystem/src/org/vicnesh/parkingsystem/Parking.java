//CHANGE NAME TO CARPARK.
//WTF IS PARKING?


package org.vicnesh.parkingsystem;

import java.util.*;

public class Parking{
	
	private String parkingName;
	private int parkingSize;
	private boolean parkingFull;
	private ParkingLot parkinglots[];
	private Gantry entryGantry;
	private Gantry exitGantry;
	
	
	
	/*constructor to set the number of parking lots in the parking space
	 * create a parking space with user input number of parking lots
	 * @parameter - int parking size input
	 * @return - 
	 */
	public Parking(String parkingNameInput,int parkingSizeInput) {
		
		parkingName = parkingNameInput;
		parkingSize =  parkingSizeInput;
		
		entryGantry = new Gantry();
		
		parkinglots = new ParkingLot[parkingSize];
		parkingFull = false;
		System.out.println("New Parking Space created: " + parkingName);
		System.out.println("Number of parking lots in " + parkingName + 
				" is: " + parkingSize);
	}
	
	public boolean isParkingFull() {
		return parkingFull;
	}
	
	public void openEntryGantry() {
		entryGantry.setGantryOpen();
	}
	
	public void closeEntryGantry() {
		entryGantry.setGantryClose();
	}
	
	public void openExitGantry() {
		exitGantry.setGantryOpen();
	}
	
	public void closeExitGantry() {
		exitGantry.setGantryClose();
	}
	
	
	
	

}