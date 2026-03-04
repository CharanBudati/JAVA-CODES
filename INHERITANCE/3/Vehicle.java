public class Vehicle{
	
	int registrationNumber;
	String fuelType;
	double maxSpeed;
	
	public Vehicle(int registrationNumber,String fuelType,double maxSpeed){
		this.registrationNumber=registrationNumber;
		this.fuelType=fuelType;
		this.maxSpeed=maxSpeed;
	}
	
	public void start(){
		System.out.println(registrationNumber + " is starting...");
	}
	
	public void stop(){
		System.out.println(registrationNumber + " is stoping...");
	}
	
	public void displayDetails(){
		System.out.println("Registration Number: " + registrationNumber);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Maximum Speed: " + maxSpeed);
	}
}