public class Employee {
	
	//Variables 
	
	private String firstName;
	private String lastName;
	private static int members = 0;
	
	//Constructor 
	
	public Employee (String fname, String lname) {
		
		this.firstName = fname;
		this.lastName = lname;
		members++;
		
		System.out.printf("Constructor %s %s and the number of members are: %d\n", fname ,lname, members);
		
	}
	

}
