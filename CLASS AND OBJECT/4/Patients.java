public class Patients{
	
	int patientID;
	String name;
	String contactNumber;
	String procedure;
	
	public Patients(int patientID,String name,String contactNumber,String procedure){
		this.patientID=patientID;
		this.name=name;
		this.contactNumber=contactNumber;
		this.procedure=procedure;	
	}
	
	double cost(){
		if (procedure=="Cleaning")
			return 500;
		else if(procedure=="Filling")
			return 1500;
		else if(procedure=="Extraction")
			return 2000;
		else if(procedure=="Root Canal")
			return 8000;
		else
			return 0;
	}
	
	public void displayDetails(){
		System.out.println("---------Patient Details---------");
		System.out.println("Patient ID: " + patientID);
		System.out.println("Patient Name: " + name);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Procedure: " + procedure);
		System.out.println("Estimated Cost: ₹" + cost());
		System.out.println("---------------------------------");
	}
}
	