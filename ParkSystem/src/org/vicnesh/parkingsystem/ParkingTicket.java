package org.vicnesh.parkingsystem;

import java.text.SimpleDateFormat;
import java.util.*;


public class ParkingTicket {
	
	//current time
	
	//current date
	
	//private 
	private String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
	private String currentTimeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
	
	
	//constructor
	public ParkingTicket() {
		System.out.println("New parking ticket issued for: ");
	}
}