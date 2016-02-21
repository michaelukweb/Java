//Bicycle Program that checks how many bikes there are, where its parked and if in use
import java.util.Scanner;
public class Cycle {
	
	//Class variables
	public static int counter = 0;
	public String bikeName;
	private static int id = 1000;
	public static int dockingStationID; 
	
	public static int lastAssignedNumber; 

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a docking number for Cycle 1: ");
		int input1 = in.nextInt();
		System.out.println("Please enter a docking number for Cycle 2: ");
		int input2 = in.nextInt();
		System.out.println("Please enter a docking number for Cycle 3: ");
		int input3 = in.nextInt();
		
		Cycle one = new Cycle();
		one.setBikeName("Raleigh");
		System.out.println("Bike one is called "+one.getBikeName() + " the bike number is "+ one.id);
		
		Cycle two = new Cycle();
	
		//Print method 
		one.printing();
		
		System.out.println("Number of Cycles currently in the system is: " + counter);
		
		//Printing the ID of the last assigned Cycle
		System.out.println("The last assigned number is: "+lastAssignedNumber);
		
	}
	
	//Each time an instance of Cycle is created variable Cycle ID is incremented 
	public Cycle() {
		id++;
		counter++;
		this.lastAssignedNumber = id;
	}
	
	//Setter - Cycle Name
	public void setBikeName(String name) {
		
		bikeName = name;
		
	}
	
	//Getter - Get Cycle name
	public String getBikeName() {
		
		return bikeName;
	}
	
	//Getter - returns ID
	public int getID() {
		
		return id;
	}
	
	//Checks where cycle is
	public boolean pickUp(){
		
		if (dockingStationID == 0) {
			
			dockingStationID = 1;
			return false;
			
		} else 
			
			return true;
	}
	
	//Check if cycle is hired and which docking station it is at
	public boolean park (int id){
		
		if (dockingStationID == 0) {
			
			dockingStationID = id;
			return true;
			 
		} else {
			
			return false;
		}
	}
	
	//
	public String getDockingStationNo() {
		
		if (dockingStationID == 0) {
			
			return "Is in use";
			
		} else {
			
			return "is at " + dockingStationID;
		}
		
	}
	
	//Returns Number of Cycles 
	public int getNumberOfCycles () {
		
		return counter;
	}
	
	//Print Method
	void printing () {
		
		System.out.println("Bike one is called "+ getBikeName() + " the bike number is "+ id);
	}

}
