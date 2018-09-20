
/*
package org.vicnesh.parkingsystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ParkingManager {
	//variables
	private Gantry entryGantry;
	private Gantry exitGantry;
	private ParkingLot parkingLots[];
	private Parking carPark;
	private boolean parkingFull;
	
	
	//methods
	//constructor
	public ParkingManager() {
		
		//create carpark
		Scanner keyboard = new Scanner(System.in);		
		
		//get user input for parking space
		System.out.println("Enter name of parking space: ");

		
		String userInputCarParkName = keyboard.nextLine();
		
		//prompt user for size of parking input
		System.out.println("Enter the number of lots in the carpark: ");
		int userInputCarParkSize = keyboard.nextInt();
		
		//create new carpark using input fields
		carPark = new Parking(userInputCarParkName, userInputCarParkSize);
		
		//Gantry
		entryGantry = new Gantry();
		exitGantry = new Gantry();
		
		
		
	}
	
	//check if parking is full or has slots
	public boolean checkIfCarParkIsFull() {
		carPark.
	}
	
	//check number of slots available
	
	//set parking slot in carpark to occupied
	//set parking slot in carpark to vacant
	
	//open entry gantry if carpark has slots
	public void openEntryGantry() {
		if (carPark.getParkingOccupancy() == true) {
			//carPark.
		}
		
	}
	
	
	//close gantry after payment is made
	
	//print parking ticket
	//handle payment
}
*/