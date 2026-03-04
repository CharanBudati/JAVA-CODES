public class Trucks extends Vehicle{
	
	double cargoLimit;
	
	public Trucks(int registrationNumber,String fuelType,double maxSpeed,double cargoLimit){
		super(registrationNumber,fuelType,maxSpeed);
		this.cargoLimit=cargoLimit;
	}
	
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Cargo Weight Limit: " + cargoLimit + " tons");
		System.out.println("This truck handles heavy load transportation.");
	}
}