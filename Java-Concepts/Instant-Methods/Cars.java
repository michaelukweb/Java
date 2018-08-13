public class Cars {
	
	//instance variable
	int carAge;
	
	//Constructor 
	public Cars (String carName) {
		
		System.out.println("Car name: " + carName);
		
	}
	
	//setter method 
	public void setAge(int age) {
		this.carAge = age;
	}	
	
	//getter method 
	public int getAge () {
		System.out.println("This car is : " + carAge + " years old");
		return carAge;
	}
	
	//Main method
	public static void main(String[] args) {
		
		//Object creation
		Cars car1 = new Cars ("Aston Martin");
		
		//Call Class method to set the cars age
		car1.setAge(2);
		
		//Call to get cars age // objectname.MethodName 
		car1.getAge();
		
	}

}