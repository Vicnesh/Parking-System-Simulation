package org.vicnesh.parkingsystem;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		
		CarparkGraphics cpg = new CarparkGraphics();
		cpg.setVisible(true);
		
		
		
		/*
		String parkingName;
		int parkingSize;
		Vehicle vehicle[];
		int userMenuChoice;
		
		
		System.out.println("Welcome to Parking System!");
		ParkingSimulator ps = new ParkingSimulator("Carpark test", 9);
		
		mainMenu();
		
		Scanner keyboard = new Scanner(System.in);
		userMenuChoice = keyboard.nextInt();
		
		
		if (userMenuChoice == 1) {
			System.out.println("What is the vehicle license plate number?");
			if (parking.isParkingFull() == false) {
				parking.openEntryGantry();
			}
			else {
				System.out.println("Carpark is currently full");
			}
		}
		else if (userMenuChoice == 2) {
			System.out.println("Exit Vehicle");
		}
		*/
		
		//user menu
		//1 to create new carpark
		//2 to view all open carparks
		
		
		
		/*GET CURRENT TIME
		String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
		String currentTimeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		
		System.out.println(currentTimeStamp);
		
		
		ZonedDateTime zdt = ZonedDateTime.now();
		int year = zdt.now().getYear();
		int month = zdt.now().getMonthValue();
		int day = zdt.now().getDayOfMonth();
		System.out.println(year);		
		System.out.println(month);
		System.out.println(day);
		*/
		
		
		
	}
	
	
	public static void mainMenu() {
		System.out.println("Main menu: ");
		System.out.println("1) New vehicle to park");
		System.out.println("2) Exit a vehicle");
	}
		
}
