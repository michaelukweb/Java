//enum EmploymentStatus { fullTime, partTime };
public class Employee {
	
	private String name;
	private static int empNumber = 1000;
	private double salary;
	private EmploymentStatus status;
	private static int recordNumber = 0;
	
	public Employee (String name, double salary, EmploymentStatus status) {//Added Parameters
		
		empNumber++;
		this.name = name;
		this.salary = salary;
		this.status = status;	
	}
	
	enum EmploymentStatus { fullTime, partTime };

	public static void main(String[] args) {
		
		/*Employee [] staffMembers = new Employee [3];
		
		staffMembers[0] = new Employee("",120000,EmploymentStatus.fullTime);
		staffMembers[0].setStatus(EmploymentStatus.fullTime);
		staffMembers[0].setName("Michael");
		staffMembers[0].setEmpNumber();
		staffMembers[0].setSalary(100000);*/
		printing();
		
	}
	
	static void printing () {
		
		Employee [] staffMembers = new Employee[2];
		
		staffMembers[0] = new Employee("Michael",120000,EmploymentStatus.fullTime);
		staffMembers[1] = new Employee("Mike",110000,EmploymentStatus.partTime);
	
		/*for (int i = 0; i < staffMembers.length; i++) {
		
		empNumber++;
		recordNumber++;
		System.out.println("Employee Record Number " + staffMembers[i].recordNumber);
        System.out.println("---------------------------");
        System.out.printf("Employee ID: %5d", staffMembers[i].getEmpNumber());
        System.out.println();  
        System.out.printf("Full Name:    %s", staffMembers[i].getName());
        System.out.printf("\nStatus:    %11s", staffMembers[i].getStatus());
        System.out.printf("%nSalary:    %12.2f", staffMembers[i].getSalary());
        System.out.println("\n---------------------------"); 
        
		}*/
		
		for (Employee emp: staffMembers) {
			
			//empNumber++;
			recordNumber++;
			System.out.println("Employee Record Number " + emp.recordNumber);
	        System.out.println("---------------------------");
	        System.out.printf("Employee ID: %5d", emp.getEmpNumber());
	        System.out.println();  
	        System.out.printf("Full Name:    %s", emp.getName());
	        System.out.printf("\nStatus:    %11s", emp.getStatus());
	        System.out.printf("%nSalary:    %12.2f", emp.getSalary());//double printf
	        System.out.println("\n---------------------------"); 
	        
			}
       
	}
	
	//Set Employee Status 
	public void setStatus(EmploymentStatus value){
		
		this.status = value;
	}
	
	public EmploymentStatus getStatus() {
		
		return status;
	}
	
	//Set Employee Number 
	public void setEmpNumber() {
		
		empNumber++;
	}
	
	public int getEmpNumber() {
		
		return empNumber;
	} 
	
	//Set Employee name 
	public void setName(String s) {
		
		name = s;
	}
	
	public String getName(){
		
		return name;
	}
	
	//Set Employee Salary
	public void setSalary(double wages){
		
		this.salary = wages;
	}
	
	public double getSalary(){
		return salary;
	}

}
