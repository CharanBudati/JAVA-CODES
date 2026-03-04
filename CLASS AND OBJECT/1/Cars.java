public class Cars{
	
	String plateNumber;
	String owner;
	String model;
	String color;
	
	public Cars(String plateNumber,String owner,String model,String color){
		this.plateNumber=plateNumber;
		this.owner=owner;
		this.model=model;
		this.color=color;
	}
	
	public void basicWash(){
		displayDetaills("Basic Exterior Wash");
	}
	
	public void interiorCleaning(){
		displayDetaills("Interior Vacuum Cleaning");
	}
	
	public void fulService(){
		displayDetaills("Full Detail Service");
	}
	
	public void displayDetaills(String serviceType){
		System.out.println("Plate Number: " + plateNumber);
		System.out.println("Owner: " + owner);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Service Type: " + serviceType);
		System.out.println("--------------------------------------");
	}
}
		