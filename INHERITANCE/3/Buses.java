public class Buses extends Vehicle{
	
	int passengerCapacity;
	
	public Buses(int registrationNumber,String fuelType,double maxSpeed,int passengerCapacity){
		super(registrationNumber,fuelType,maxSpeed);
		this.passengerCapacity=passengerCapacity;
	}
	
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Passenger Capacity: " + passengerCapacity);
		System.out.println("This bus serves high passenger routes...");
	}
}