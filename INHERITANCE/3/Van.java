public class Van extends Vehicle{
	
	boolean refrigeration;
	
	public Van(int registrationNumber,String fuelType,double maxSpeed,boolean refrigeration){
		super(registrationNumber,fuelType,maxSpeed);
		this.refrigeration=refrigeration;
	}
	
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Refrigeration Support: " + refrigeration);
        if (refrigeration)
            System.out.println("This van keeps goods cold.");
        else
            System.out.println("This van does not support refrigeration.");
    }
}