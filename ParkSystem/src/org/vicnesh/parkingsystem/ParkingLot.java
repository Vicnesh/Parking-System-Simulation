package org.vicnesh.parkingsystem;


public class ParkingLot {
	private String lotID;
	private String lotType;
	private boolean lotEmpty;
	
	//constructor
	public ParkingLot() {
		
	}
	
	/*Setter lot number
	*@parameter - String lot Number 
	*
	*/
	public void setParkingLotNumber(String lotIDInput) {
		lotID = lotIDInput;
	}
	
	/*Getter lot number
	 * @parameter - 
	 * @return - String lotNumber
	 */
	public String getParkingLotNumber() {
		return lotID;
	}
	
	
	/*Setter lot type
	 * @parameter - String lot type input
	 * @return - 
	 */
	public void setParkingLotType(String lotTypeInput) {
		lotType = lotTypeInput;
	}
	
	
	/*Getter lot type
	 * @paremeter - 
	 * @return - string lot type
	 */
	public String getParkingLotType() {
		return lotType; 
	}
	
	
	//setter for parking lot vacancy
	public void setParkingLotEmpty() {
		lotEmpty = true;
	}
	
	//setter for parking lot Occupied
	public void setParkingLotVacancy() {
		lotEmpty = false;
	}
	
	//getter for parking lot status
	public boolean getParkingLotOccupancy() {
		return lotEmpty;
	}
	
	

}