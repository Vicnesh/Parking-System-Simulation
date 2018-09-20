package org.vicnesh.parkingsystem;

import java.text.SimpleDateFormat;


/*
 * creates a random number of vehicles
 * vehicle enters carpark
 * check if carpark is full
 * carpark prints ticket  
 * open gantry
 * vehicle enter
 * gantry close
 * vehicle finds a parking lot
 * parking lot set to occupied
 * 
 * if car wants to exit
 * accept ticket
 * check car entrance timing difference with current time
 * show parking price
 * make payment
 * open exit gantry
 * vehicle exit
 * close gantry
 */

public class ParkingSimulator {
	
	
	//variables
	private Vehicle vehicles[];
	private Parking carPark;
	
	
	//methods
	public ParkingSimulator(String carParkName, int carParkSize) {
		carPark = new Parking(carParkName, carParkSize);
		vehicles = new Vehicle[10];
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}