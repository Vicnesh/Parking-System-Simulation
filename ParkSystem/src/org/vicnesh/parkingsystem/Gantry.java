//gantry for parking
//entry/exit
package org.vicnesh.parkingsystem;

/*gantry class for parking system
*used to allow vehicles to entry/exit after processing
*/

public class Gantry {
	private boolean gantryOpen;
	
	//constructor
	public Gantry() {
		System.out.println("Gantry created");
	}
	
	
	public boolean getGantryStatus() {
		return this.gantryOpen;
	}
	
	
	//to set gantry to open
	public void setGantryOpen() {
		if (this.gantryOpen == false) {
			gantryOpen = true;
		}
		System.out.println("Gantry is open");
	}
	
	
	//to set gantry to close
	public void setGantryClose() {
		if(this.gantryOpen == true) {
			gantryOpen = false;
		}
		System.out.println("Gantry is closed");
	}
	
}
