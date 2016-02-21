import java.util.Scanner;
public class TestCycle {

	public static void main(String[] args) {
		
		Cycle bike1 = new Cycle();
		

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the docking station Number");
		int x = in.nextInt();
		bike1.park(x);
		bike1.getDockingStationNo();
		bike1.printing();
		
		Cycle test = new Cycle();
		
		System.out.println("The number of cycles are: " + test.getNumberOfCycles() + " " + test.pickUp());
		
		Cycle [] bikes = new Cycle[10];
		
		for (int i = 0; i < bikes.length; i++) {
			
			bikes[i] = new Cycle();
			
			System.out.println("At which docking station number would you like to park at");
			int n = in.nextInt();
			bikes[i].park(n);
			
			System.out.println("Bike Id " + bikes[i].getID());
			System.out.println("Bike is parked at "+bikes[i].getDockingStationNo());
			System.out.println("The total number of Cycles are " + bikes[i].getNumberOfCycles());
			
		}
		
	}
	
	public int getRandomNumber(int min, int max) {
		
		return min/max;
		
	}

}
